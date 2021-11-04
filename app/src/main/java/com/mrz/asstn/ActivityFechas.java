package com.mrz.asstn;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.CURSOS_TAB;
import static com.mrz.asstn.dbHelper.HORA_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;
import static com.mrz.asstn.dbHelper.PRESENTE_COL;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ActivityFechas extends AppCompatActivity {
    LinearLayout Dates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fechas);
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        @SuppressLint("Recycle") Cursor c = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        Dates = findViewById(R.id.fechas);
        if (c.moveToFirst()) {
            while (!c.isAfterLast()) {
                if (c.getString(0).equals("android_metadata") || c.getString(0).equals("sqlite_sequence") || c.getString(0).equals("Cursos")) {
                    c.moveToNext();
                } else {
                    Dates.addView(Button(c.getString(0)));
                    c.moveToNext();
                }
            }
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ActivityFechas.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private View Button(final String fecha) {
        final Button button = new Button(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setTextColor(Color.parseColor("#FFFFFF"));
        button.setAllCaps(false); //Disable caps to support html
        button.setText(Html.fromHtml("Fecha " + fecha));
        button.setBackgroundColor(Color.parseColor("#1C262D"));
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder ask = new AlertDialog.Builder(ActivityFechas.this);
                ask.setTitle("Crear PDF?").setMessage("Desea crear un PDF con todos los cursos y alumnos asistidos ese dia?");
                ask.setCancelable(false);
                ask.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            createPdf(fecha);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (DocumentException e) {
                            e.printStackTrace();
                        }
                    }
                });
                ask.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                ask.show();
                return false;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iniciar = new Intent(ActivityFechas.this, ActivityCursos.class);
                iniciar.putExtra("Fecha", fecha);
                startActivity(iniciar);
                finish();
            }
        });

        return button;
    }

    public void createPdf(String fecha) throws FileNotFoundException, DocumentException {
        //Impresion de la base de datos a PDF asistida por Nazareno Busi
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        String dir = getApplicationContext().getExternalFilesDir("").getPath()+File.separator+"PDFS";
        File folder = new File(dir);
        folder.mkdirs();
        File file = new File(dir, "Informacion de "+fecha+".pdf");
        Cursor c1 = db.rawQuery("SELECT * FROM `" + CURSOS_TAB +"`", null);
        Document document = new Document();  // create the document
        PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        if (c1.moveToFirst()) {
            while (!c1.isAfterLast()) {
                PdfPCell p3 = new PdfPCell(new Paragraph(c1.getString(c1.getColumnIndex(CURSOS_COL))));
                p3.setBorder(Rectangle.NO_BORDER);
                p3.setHorizontalAlignment(Element.ALIGN_CENTER);
                PdfPTable FooterNote = new PdfPTable(1);
                FooterNote.setTotalWidth(222f);
                FooterNote.addCell(p3);
                document.add(FooterNote);
                PdfPTable table = new PdfPTable(3);
                table.addCell("Nombre y apellido");
                table.addCell("Presente");
                table.addCell("Hora de llegada");
                @SuppressLint("Recycle") Cursor c2 = db.rawQuery("SELECT * FROM `" + fecha + "` WHERE `" + CURSOS_COL + "` = '" + c1.getString(c1.getColumnIndex(CURSOS_COL)) + "'", null);
                if (c2.moveToFirst()) {
                    while (!c2.isAfterLast()) {
                        String nombreyapellido = c2.getString(c2.getColumnIndex(NOMBRE_Y_APPELIDO_COL));
                        String presente = c2.getString(c2.getColumnIndex(PRESENTE_COL));
                        String horadellegada = c2.getString(c2.getColumnIndex(HORA_COL));
                        Log.d("IngresAR", nombreyapellido + " " + presente + " " + horadellegada + " " + c2.getString(c2.getColumnIndex(CURSOS_COL)));
                        table.addCell(nombreyapellido);
                        table.addCell(presente);
                        if(horadellegada == null){
                            table.addCell("Sin presentar");
                        } else {
                            table.addCell(horadellegada);
                        }
                        c2.moveToNext();
                    }
                }
                document.add(table);
                document.newPage();
                c1.moveToNext();
            }
        }
        document.addCreationDate();
        document.close();
    }
}
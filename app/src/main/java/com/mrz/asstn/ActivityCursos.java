package com.mrz.asstn;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.CURSOS_TAB;
import static com.mrz.asstn.dbHelper.HORA_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;
import static com.mrz.asstn.dbHelper.PRESENTE_COL;
import static com.mrz.asstn.dbHelper.TARDANZA_COL;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

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

public class ActivityCursos extends AppCompatActivity {
    LinearLayout Cursos;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ActivityCursos.this, ActivityFechas.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getReadableDatabase();
        Intent intent = getIntent();
        String fecha = intent.getStringExtra("Fecha");
        Cursos = findViewById(R.id.Cursos);
        @SuppressLint("Recycle") Cursor c = db.rawQuery("select * from `"+CURSOS_TAB+"`", null);
        if (c.moveToFirst()) {
            while ( !c.isAfterLast() ) {
                Cursos.addView(Button(fecha,c.getString(c.getColumnIndex(CURSOS_COL))));
                c.moveToNext();
            }
        }
    }

    private View Button(final String fecha,final String curso) {
        final Button button = new Button(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setTextColor(Color.parseColor("#FFFFFF"));
        button.setAllCaps(false); //Disable caps to support html
        button.setText(Html.fromHtml("Curso "+curso));
        button.setBackgroundColor(Color.parseColor("#1C262D"));
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder ask = new AlertDialog.Builder(ActivityCursos.this);
                ask.setTitle("Crear PDF?").setMessage("Desea crear un PDF con todos los alumnos asistidos de este curso ese dia?");
                ask.setCancelable(false);
                ask.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            createPdf(fecha,curso);
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
                Intent iniciar = new Intent(ActivityCursos.this, ActivityAlumnos.class);
                iniciar.putExtra("Fecha",fecha);
                iniciar.putExtra("Curso",curso);
                startActivity(iniciar);
            }
        });

        return button;
    }

    public void createPdf(String fecha, String curss) throws FileNotFoundException, DocumentException {
        //Impresion de la base de datos a PDF asistida por Nazareno Busi
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        String dir = getApplicationContext().getExternalFilesDir("").getPath()+File.separator+"PDFS";
        File folder = new File(dir);
        folder.mkdirs();
        File file = new File(dir, "Informacion de "+curss+" "+fecha+".pdf");
        Document document = new Document();  // create the document
        PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        PdfPCell p3 = new PdfPCell(new Paragraph(curss));
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
        @SuppressLint("Recycle") Cursor c2 = db.rawQuery("SELECT * FROM `" + fecha + "` WHERE `" + CURSOS_COL + "` = '" + curss + "'", null);
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
        document.addCreationDate();
        document.close();
    }
}
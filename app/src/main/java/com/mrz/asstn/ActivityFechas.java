package com.mrz.asstn;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.HORA_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
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
                CreatePDF(fecha);
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

    public void CreatePDF(String basedatos){
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        String query = "Select * from "+basedatos;
        Cursor cursor = db.rawQuery(query,null);
        PdfDocument pdfDocument = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(300, 600,1).create();
        PdfDocument.Page page = pdfDocument.startPage(pageInfo);
        page.getCanvas().drawText(cursor.getString(cursor.getColumnIndex(NOMBRE_Y_APPELIDO_COL)) + " " + cursor.getString(cursor.getColumnIndex(CURSOS_COL)) + " " + cursor.getString(cursor.getColumnIndex(HORA_COL)),10, 25, new Paint());
        pdfDocument.finishPage(page);
        String filePath = Environment.getExternalStorageDirectory().getPath()+"/Download/"+ basedatos +".pdf";
        File file = new File(filePath);
        try {
            pdfDocument.writeTo(new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pdfDocument.close();
    }
}
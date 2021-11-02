package com.mrz.asstn;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.HORA_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;
import static com.mrz.asstn.dbHelper.PRESENTE_COL;
import static com.mrz.asstn.dbHelper.TARDANZA_COL;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ActivityAlumnos extends AppCompatActivity {
    LinearLayout Alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getReadableDatabase();
        Intent intent = getIntent();
        String fecha = intent.getStringExtra("Fecha");
        String curso = intent.getStringExtra("Curso");
        Alumnos = findViewById(R.id.Alumnos);
        @SuppressLint("Recycle") Cursor c = db.rawQuery("select * from `"+fecha+"` where `"+CURSOS_COL+"` = '"+curso+"'", null);
        if (c.moveToFirst()) {
            while ( !c.isAfterLast() ) {
                Alumnos.addView(Button(c.getString(c.getColumnIndex(NOMBRE_Y_APPELIDO_COL)),c.getString(c.getColumnIndex(PRESENTE_COL)),c.getString(c.getColumnIndex(TARDANZA_COL)),c.getString(c.getColumnIndex(HORA_COL))));
                c.moveToNext();
            }
        }
    }

    private View Button(final String Nombre, final String Presente,final String Tardanza,final String Hora) {
        final Button button = new Button(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setTextColor(Color.parseColor("#FFFFFF"));
        button.setAllCaps(false); //Disable caps to support html
        if(Presente.equals("Presente") && Tardanza.equals("No")) {
            button.setText(Html.fromHtml(Nombre +" <font color='green'>PRESENTE"));
        } else if (Presente.equals("Presente") && Tardanza.equals("Si")) {
            button.setText(Html.fromHtml(Nombre +" <font color='yellow'>TARDANZA"));
        } else {
            button.setText(Html.fromHtml(Nombre +" <font color='red'>AUSENTE"));
        }
        button.setBackgroundColor(Color.parseColor("#1C262D"));
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(Presente.equals("Presente")) Toast.makeText(ActivityAlumnos.this,"Hora de llegada "+Hora,Toast.LENGTH_SHORT).show();
                else Toast.makeText(ActivityAlumnos.this,"El alumno no se presento",Toast.LENGTH_SHORT).show();
            }
        });
        return button;
    }
}
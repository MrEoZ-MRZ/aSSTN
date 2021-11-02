package com.mrz.asstn;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.CURSOS_TAB;
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
}
package com.mrz.asstn;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import androidx.annotation.ColorRes;
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

public class ActivityDates extends AppCompatActivity {
    LinearLayout Dates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);
        dbHelper dbhelp = new dbHelper(this);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        @SuppressLint("Recycle") Cursor c = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        Dates = findViewById(R.id.fechas);
        if (c.moveToFirst()) {
            while ( !c.isAfterLast() ) {
                if(c.getString(0).equals("android_metadata") || c.getString(0).equals("sqlite_sequence")){
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
        Intent intent = new Intent(ActivityDates.this, MainActivity.class);
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
        button.setText(Html.fromHtml("Fecha "+fecha));
        button.setBackgroundColor(Color.parseColor("#1C262D"));
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iniciar = new Intent(ActivityDates.this,ActivityInfo.class);
                iniciar.putExtra("Fecha",fecha);
                startActivity(iniciar);
                finish();
            }
        });

        return button;
    }
}
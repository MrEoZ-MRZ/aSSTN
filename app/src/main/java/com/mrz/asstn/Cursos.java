package com.mrz.asstn;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.DNI_COL;
import static com.mrz.asstn.dbHelper.GENERO_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;
import static com.mrz.asstn.dbHelper.PRESENTE_COL;
import static com.mrz.asstn.dbHelper.getTodaysTable;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Cursos {

    //Añadir los alumnos por curso a medida que la tabla diaria se crea
    public static void AñadirSextoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	AVELLANEDA");
        values.put(DNI_COL, "44306544");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }
    
    public static void AñadirQuintoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SANTIAGO NICOLAS BELLO");
        values.put(DNI_COL, "43959846");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }

    public static void AñadirCuartoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AGUSTINA GUADALUPE ARIADNA");
        values.put(DNI_COL, "46030456");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }

    public static void AñadirTerceroB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN GERARDO GUADALUPE");
        values.put(DNI_COL, "46863224");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }

    public static void AñadirPrimeroB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CHIARA ALMEIRA");
        values.put(DNI_COL, "48184125");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }
}

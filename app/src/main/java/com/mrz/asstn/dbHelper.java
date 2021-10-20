package com.mrz.asstn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {
    /** Nombre del archivo de la base de datos */
    public static final String DATABASE_NAME = "aSSTN.db";

    /** Versión de la base de datos. Si cambia el esquema de la base de datos, debe incrementar la versión de la base de datos. */
    private static final int DATABASE_VERSION = 1;

    public dbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Cree una cadena que contenga la declaración SQL para crear la tabla de alumnos
        String SQL_CREATE_PRODUCTS_TABLE = "CREATE TABLE " + dbContract.aSSTNEntry.TABLE_6B + " ("
                + dbContract.aSSTNEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + dbContract.aSSTNEntry.COLUM_NT + " INTEGER NOT NULL, "
                + dbContract.aSSTNEntry.COLUM_NA + " TEXT NOT NULL, "
                + dbContract.aSSTNEntry.COLUM_DNI + " INTEGER NOT NULL, "
                + dbContract.aSSTNEntry.COLUM_SEXO + " TEXT NOT NULL, "
                + dbContract.aSSTNEntry.COLUM_NACIMIENTO + " TEXT NOT NULL);";
        db.execSQL(SQL_CREATE_PRODUCTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // La base de datos todavía está en la versión 1, por lo que no hay nada que hacer aquí.
    }
}

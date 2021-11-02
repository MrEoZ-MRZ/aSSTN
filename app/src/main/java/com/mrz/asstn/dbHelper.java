package com.mrz.asstn;

import static com.mrz.asstn.Cursos.AñadirSextoB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dbHelper extends SQLiteOpenHelper {

    //Version de la tabla
    private static final int DB_VERSION = 1;

    //Nombre de la base de datos
    private static final String DB_NAME = "IngresAR";

    //Nombre de la tabla de cursos
    public static final String CURSOS_TAB = "Cursos";

    //Nombre de las columnas de los cursos
    private static final String SEXTOB_COL = "6B";
    private static final String QUINTOB_COL = "5B";
    private static final String CUARTOB_COL = "4B";
    private static final String TERCEROB_COL = "3B";
    private static final String SEGUNDOB_COL = "2B";
    private static final String PRIMEROB_COL = "1B";

    //Nombre de las columnas de alumnos
    private static final String ID_COL = "id";
    public static final String NOMBRE_Y_APPELIDO_COL = "Nombre_Y_Apellido";
    public static final String DNI_COL = "DNI";
    public static final String CURSOS_COL = "Cursos";
    public static final String HORA_COL = "Hora";
    public static final String TARDANZA_COL = "Tarde";
    public static final String GENERO_COL = "Sexo";
    public static final String PRESENTE_COL = "Presente";

    //Crear el constructor de la base de datos (Si la misma no existe)
    public dbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    //Metodo onCreate para crear la tabla con los cursos
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CURSOS = "CREATE TABLE " + CURSOS_TAB + " ("
                + CURSOS_COL + " TEXT NOT NULL);";
        db.execSQL(CURSOS);
        db.execSQL("INSERT INTO " + CURSOS_TAB + " (" + CURSOS_COL + ") VALUES ('" + SEXTOB_COL + "')");
        db.execSQL("INSERT INTO " + CURSOS_TAB + " (" + CURSOS_COL + ") VALUES ('" + QUINTOB_COL + "')");
        db.execSQL("INSERT INTO " + CURSOS_TAB + " (" + CURSOS_COL + ") VALUES ('" + CUARTOB_COL + "')");
        db.execSQL("INSERT INTO " + CURSOS_TAB + " (" + CURSOS_COL + ") VALUES ('" + TERCEROB_COL + "')");
        db.execSQL("INSERT INTO " + CURSOS_TAB + " (" + CURSOS_COL + ") VALUES ('" + SEGUNDOB_COL + "')");
        db.execSQL("INSERT INTO " + CURSOS_TAB + " (" + CURSOS_COL + ") VALUES ('" + PRIMEROB_COL + "')");

    }

    //Funcion para buscar el alumno en la base de datos
    public Cursor BuscarAlumno(String id,Context ctx){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM "+getTodaysTable(ctx)+" WHERE "+DNI_COL+" LIKE "+ "'"+ id + "'",null);
        return cursor;
    }

    //Funcion para ingresar asistencia al alumno con la hora a la abase de datos
    public static void IngresarAsistencia(String DNI, String Presente,Context ctx) {
        Calendar calendar = Calendar.getInstance();
        int hour24hrs = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PRESENTE_COL, Presente);
        values.put(HORA_COL, hour24hrs + ":" + minutes +":"+ seconds);
        if(hour24hrs >= 8){
            values.put(TARDANZA_COL,"Si");
        } else {
            values.put(TARDANZA_COL,"No");
        }
        db.update(getTodaysTable(ctx), values, "`"+DNI_COL+"`='"+DNI+"'", null);
        Cursor info = db.rawQuery("select * from "+getTodaysTable(ctx)+" where `" + DNI_COL + "` = '"+DNI+"'",null);
        if(info.moveToNext()){
            Log.d("IngresAR","Alumno "+info.getString(info.getColumnIndex(NOMBRE_Y_APPELIDO_COL)) + " esta " + info.getString(info.getColumnIndex(PRESENTE_COL))+ " a la hora " + info.getString(info.getColumnIndex(HORA_COL)));
        } else {
            Log.d("IngresAR", "El DNI " + DNI + " no ha sido encontrado");
        }
        db.close();
    }

    //Funcion para verificar la existencia de la base de datos diaria
    private static boolean VerificarExistencia(String tableName, Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        boolean rv = false;
        String whereclause = "name" + "=? AND " + "type" + "=?";
        String[] whereargs = new String[]{tableName,"table"};
        Cursor csr = db.query(
                "sqlite_master",
                null,
                whereclause,
                whereargs,
                null,null,null
        );
        if (csr.getCount() > 0) rv = true;
        csr.close();
        return rv;
    }

    //Añadir los cursos registrados
    public static void AñadirCursos(Context ctx) {
        AñadirSextoB(ctx);
    }

    //Crea la tabla con la fecha actual en la base de datos
    private static String Creartabladiaria() {
        return "CREATE TABLE IF NOT EXISTS " + getCurrentTableName() +
                "(" +
                ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NOMBRE_Y_APPELIDO_COL + " TEXT,"
                + DNI_COL + " TEXT,"
                + CURSOS_COL + " TEXT,"
                + PRESENTE_COL + " TEXT,"
                + HORA_COL + " TEXT NULL DEFAULT NULL,"
                + TARDANZA_COL + " TEXT NULL DEFAULT NULL,"
                + GENERO_COL + " TEXT)";
    }

    //Obtener base de datos de actual y si no esta disponible crearla
    public static String getTodaysTable(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        String currentTableName;
        currentTableName = getCurrentTableName();
        if (!VerificarExistencia(currentTableName,ctx)) {
            db.execSQL(Creartabladiaria());
        }
        return currentTableName;
    }

    //Obtener fecha actual
    private static String getCurrentTableName() {
        SimpleDateFormat currentDate = new SimpleDateFormat("dd-MM-YYYY");
        return "[" + currentDate.format(System.currentTimeMillis()) + "]";
    }

    //Actualizador de la base de datos
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //La base de datos siempre va a ser version 1 no hace falta actualizarla
    }
}

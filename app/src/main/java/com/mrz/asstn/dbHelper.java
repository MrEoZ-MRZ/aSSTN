package com.mrz.asstn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;

public class dbHelper extends SQLiteOpenHelper {

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    public static final String TABLE_NAME = "SextoB";
    private static final String DB_NAME = "IngresAR";

    // below variable is for our id column.
    private static final String ID_COL = "id";

    // below variable is for our course name column
    public static final String NOMBRE_Y_APPELIDO_COL = "Nombre_Y_Apellido";

    // below variable id for our course duration column.
    public static final String DNI_COL = "DNI";

    // below variable for our course description column.
    public static final String GENERO_COL = "Sexo";

    public static final String PRESENTE_COL = "Presente";

    // creating a constructor for our database handler.
    public dbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NOMBRE_Y_APPELIDO_COL + " TEXT,"
                + DNI_COL + " TEXT,"
                + GENERO_COL + " TEXT)";

        db.execSQL(query);
    }

    public Cursor BuscarAlumno(String id){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        //String qry = "SELECT * FROM "+TABLE_NAME+" WHERE ID="+id;
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME+" WHERE "+DNI_COL+" LIKE "+ "'"+ id + "'",null);
        return cursor;
    }

    public Cursor BuscarPresente(String id, Context ctx){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        //String qry = "SELECT * FROM "+TABLE_NAME+" WHERE ID="+id;
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM "+getTodaysTable(ctx)+" WHERE "+DNI_COL+" LIKE "+ "'"+ id + "'",null);
        return cursor;
    }

    // this method is use to add new course to our sqlite database.
    public static void IngresarAsistencia(String DNI, String Presente,Context ctx) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

        // after adding all values we are passing
        // content values to our table.
        db.execSQL("UPDATE "+getTodaysTable(ctx)+" SET "+PRESENTE_COL+" = "+Presente+" WHERE "+DNI_COL+" ="+DNI);
    }

    // this method is use to add new course to our sqlite database.
    public static boolean IngresarAlumno(String Nombre, String DNI, String genero,Context ctx) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();


        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        values.put(NOMBRE_Y_APPELIDO_COL, Nombre);
        values.put(DNI_COL, DNI);
        values.put(GENERO_COL, genero);

        // after adding all values we are passing
        // content values to our table.
        return db.insert(TABLE_NAME, null, values) > 0;
    }

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

    public static void AñadirAlumnos(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

        //Elias Arredondo
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	ARREDONDO");
        values.put(DNI_COL, "44306594");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//Juan Pablo Bagnardi
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO BAGNARDI");
        values.put(DNI_COL, "44731531");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO ANGEL BENTANCOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO ANGEL	BENTANCOUR");
        values.put(DNI_COL, "43827843");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAZARENO DANIEL BUSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAZARENO DANIEL BUSI");
        values.put(DNI_COL, "43827843");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARÍA SOLEDAD CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARÍA SOLEDAD CABRERA");
        values.put(DNI_COL, "44525032");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTÍN FACUNDO CAPOCCETTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTÍN FACUNDO CAPOCCETTI");
        values.put(DNI_COL, "44781490");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MÁXIMO SANTIAGO CHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MÁXIMO SANTIAGO CHIA");
        values.put(DNI_COL, "44629213");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN NICOLÁS IVÁN CLAVIJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN NICOLÁS IVÁN CLAVIJO");
        values.put(DNI_COL, "44290454");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUILLERMINA GUADALUPE	CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUILLERMINA GUADALUPE CÓRDOBA");
        values.put(DNI_COL, "44290480");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS LUCÍA CORNAGLIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS LUCÍA CORNAGLIA");
        values.put(DNI_COL, "44065983");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN JOSÉ MARÍA COSTANZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN JOSÉ MARÍA COSTANZO");
        values.put(DNI_COL, "44781435");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVO CROCI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVO CROCI");
        values.put(DNI_COL, "44765934");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LISET VALERIA	FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LISET VALERIA FERNANDEZ");
        values.put(DNI_COL, "44781469");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//THÓMAS FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "THÓMAS FERNANDEZ");
        values.put(DNI_COL, "44630141");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO BENJAMÍN FERNÁNDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO BENJAMÍN FERNÁNDEZ");
        values.put(DNI_COL, "44865684");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS AGUSTÍN	FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS AGUSTÍN FRANCO");
        values.put(DNI_COL, "44781614");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTÍN GALFRÉ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTÍN GALFRÉ");
        values.put(DNI_COL, "44178584");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEONARDO EMANUEL GRANDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONARDO EMANUEL GRANDE");
        values.put(DNI_COL, "44781488");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALEXIS RICARDO MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALEXIS RICARDO MAINA");
        values.put(DNI_COL, "44630054");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFÍA MAGALÍ MARSÓ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFÍA MAGALÍ MARSÓ");
        values.put(DNI_COL, "44629383");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO GABRIEL	MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO GABRIEL MEDINA");
        values.put(DNI_COL, "44777198");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUIN RAFAEL NUÑEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN RAFAEL NUÑEZ");
        values.put(DNI_COL, "44781478");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PAULA DANIELA	OSUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PAULA DANIELA	OSUNA");
        values.put(DNI_COL, "44178649");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VIOLETA ETELVINA PIERINI PETROSINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VIOLETA ETELVINA PIERINI PETROSINO");
        values.put(DNI_COL, "44178599");
        values.put(GENERO_COL, "F"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO EMILIANO POIRIER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO EMILIANO POIRIER");
        values.put(DNI_COL, "44731567");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATIAS NICOLAS RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATIAS NICOLAS RINALDI");
        values.put(DNI_COL, "44178648");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//ORLANDO NICOLÁS ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ORLANDO NICOLÁS ROMERO");
        values.put(DNI_COL, "44865276");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTOR ANDRÉS	RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTOR ANDRÉS	RUIZ DIAZ");
        values.put(DNI_COL, "44765942");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GABRIEL OCTAVIO RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GABRIEL OCTAVIO RUSCITTI");
        values.put(DNI_COL, "44306455");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO NAHUEL RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NAHUEL RUSCITTI");
        values.put(DNI_COL, "44306520");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO ELÍAS	SANTOS RIAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO ELÍAS SANTOS RIAL");
        values.put(DNI_COL, "44765908");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRO GUILLERMO VARGAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRO GUILLERMO	VARGAS");
        values.put(DNI_COL, "44290356");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO VIVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO VIVA");
        values.put(DNI_COL, "45058369");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//WALTER RUBÉN VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "WALTER RUBÉN VIVAS");
        values.put(DNI_COL, "44630026");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//HERNÁN ALEJANDRO WILLENER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "HERNÁN ALEJANDRO WILLENER");
        values.put(DNI_COL, "44064686");
        values.put(GENERO_COL, "M"); values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    private static String Creartabladiaria() {
        return "CREATE TABLE IF NOT EXISTS " + getCurrentTableName() +
                "(" +
                ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NOMBRE_Y_APPELIDO_COL + " TEXT,"
                + DNI_COL + " TEXT,"
                + PRESENTE_COL + " TEXT,"
                + GENERO_COL + " TEXT)";
    }


    private static String getTodaysTable(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();
        String currentTableName;
        currentTableName = getCurrentTableName();
        if (!VerificarExistencia(currentTableName,ctx)) {
            db.execSQL(Creartabladiaria());
        }
        return currentTableName;
    }

    private static String getCurrentTableName() {
        SimpleDateFormat currentDate = new SimpleDateFormat("dd-MM-YYYY");
        String currentTableName;
        return currentTableName = "[" + currentDate.format(System.currentTimeMillis()) + "]";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

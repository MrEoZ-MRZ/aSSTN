package com.mrz.asstn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;

public class dbHelper extends SQLiteOpenHelper {

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    private static final String TABLE_NAME = "SextoB";
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

        // at last we are calling a exec sql
        // method to execute above sql query
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
    public static boolean IngresarAsistencia(String Nombre, String DNI, String genero, String Presente,Context ctx) {

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
        values.put(PRESENTE_COL, Presente);

        // after adding all values we are passing
        // content values to our table.
        return db.insert(getTodaysTable(ctx), null, values) > 0;
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

    private static String Creartabladiaria() {
        return "CREATE TABLE IF NOT EXISTS " + getCurrentTableName() +
                "(" +
                ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NOMBRE_Y_APPELIDO_COL + " TEXT,"
                + DNI_COL + " TEXT,"
                + PRESENTE_COL + " TEXT,"
                + GENERO_COL + " TEXT)";
    }

    SimpleDateFormat currentDate = new SimpleDateFormat("dd-MM-YYYY");
    String currentTableName;

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

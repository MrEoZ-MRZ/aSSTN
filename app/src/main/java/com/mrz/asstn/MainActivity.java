package com.mrz.asstn;

import static com.mrz.asstn.dbHelper.DNI_COL;
import static com.mrz.asstn.dbHelper.GENERO_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;
import static com.mrz.asstn.dbHelper.TABLE_NAME;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    //Declarar boton
    private Button Escanear;
    private Button Añadir;

    //Declarar base de datos
    dbHelper mDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        VerificarSiSeBoteo();
    }

    private void VerificarSiSeBoteo() {
        if(!Preferencias.with(this).read("FirstBoot").equals("false")) {
            Log.d("IngresAR","Alumnos añadidos");
            dbHelper.AñadirAlumnos(this);
            Preferencias.with(this).write("FirstBoot","false");
        }
        ConstruirSentencia();
    }

    private void ConstruirSentencia() {
        mDBHelper = new dbHelper(MainActivity.this);
        //Establecer vista principal
        setContentView(R.layout.activity_main);
        //Asociar boton con el de la vista principal
        Añadir = findViewById(R.id.showpbtn);
        Escanear = findViewById(R.id.startbtn);
        //Darle una funcion de onclick
        Escanear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Definir actividad de escaneo
                IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.PDF_417);
                integrator.setPrompt(" Escanea el DNI");
                integrator.initiateScan();
            }
        });
    }

    private void handleResult(IntentResult scanResult) {
        if (scanResult != null) {
            updateUI(scanResult.getContents());
        } else {
            Toast.makeText(this, "No se ha leído nada :(", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateUI(String scan_result) {
        mDBHelper = new dbHelper(MainActivity.this);
        String[] SPLIT = scan_result.split("@");
        String APPELLIDO = SPLIT[1];
        String NOMBRE = SPLIT[2];
        String SEXO = SPLIT[3];
        String DNI = SPLIT[4];
        Cursor result = mDBHelper.BuscarAlumno(DNI);
        while (result.moveToNext()){
            String RESULTADO = result.getString(result.getColumnIndex(NOMBRE_Y_APPELIDO_COL));
            dbHelper.IngresarAsistencia(DNI,"Presente",this);
            Toast.makeText(this,RESULTADO + " PRESENTE",Toast.LENGTH_SHORT).show();
            return;
        } if (!result.moveToNext()){
            boolean añadido = dbHelper.IngresarAlumno(NOMBRE+" "+APPELLIDO,DNI,SEXO,this);
            if(añadido){
                dbHelper.IngresarAsistencia(DNI,"Presente",this);
                Toast.makeText(this,"Alumno " + NOMBRE + " Añadido al curso",Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this,"No se ha podido añadir",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        final IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        handleResult(scanResult);
    }
}
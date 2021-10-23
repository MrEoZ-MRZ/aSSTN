package com.mrz.asstn;

import static com.mrz.asstn.dbContract.aSSTNEntry.COLUM_DNI;
import static com.mrz.asstn.dbContract.aSSTNEntry.COLUM_NA;
import static com.mrz.asstn.dbContract.aSSTNEntry.TABLE_6B;
import static com.mrz.asstn.dbHelper.IngresarAlumno;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    //Declarar boton
    private Button Escanear;
    private Button Añadir;
    //Lista de presentes
    private StringBuilder Presentes;
    dbHelper mDBHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                integrator.setRequestCode(1);
                integrator.setPrompt(" Escanea el DNI");
                integrator.initiateScan();
            }
        });
        Añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.PDF_417);
                integrator.setRequestCode(2);
                integrator.setPrompt(" Escanea el DNI");
                integrator.initiateScan();
            }
        });
    }
    private void handleResult(IntentResult scanResult, int Code) {
        if (scanResult != null) {
            updateUI(scanResult.getContents());
        } else {
            Toast.makeText(this, "No se ha leído nada :(", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateUI(String scan_result) {
        mDBHelper = new dbHelper(this);
        Cursor result = mDBHelper.BuscarAlumno(scan_result);
        while (result.moveToNext()){
            String RESULTADO = result.getString(result.getColumnIndex(dbHelper.NOMBRE_Y_APPELIDO_COL));
            String[] SPLIT = RESULTADO.split("@");
            String APPELLIDO = SPLIT[1];
            String NOMBRE = SPLIT[2];
            Toast.makeText(this,APPELLIDO+" "+NOMBRE,Toast.LENGTH_SHORT).show();
            return;
        } if (!result.moveToNext()){
            String RESULTADO = result.getString(result.getColumnIndex(dbHelper.NOMBRE_Y_APPELIDO_COL));
            String[] SPLIT = RESULTADO.split("@");
            String APPELLIDO = SPLIT[1];
            String NOMBRE = SPLIT[2];
            String SEXO = SPLIT[3];
            String DNI = SPLIT[4];

            boolean añadido = dbHelper.IngresarAlumno(APPELLIDO+" "+NOMBRE,DNI,SEXO,this);
            if(añadido){
                Toast.makeText(this,"Se ha añadido correctamente el alumno",Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this,"No se ha podido añadir",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        final IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        handleResult(scanResult,resultCode);
    }
}
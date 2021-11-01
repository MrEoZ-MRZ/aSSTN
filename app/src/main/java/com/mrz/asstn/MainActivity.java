package com.mrz.asstn;

import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    //Declarar botones
    private Button Escanear;
    private Button Ver;

    //Declarar base de datos
    dbHelper mDBHelper;

    //Funcion onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Verificacion();
    }

    boolean twice;
    @Override
    public void onBackPressed() {
        if(twice){
            System.exit(0);
        }
        Toast.makeText(this,"Preciona nuevamente para salir",Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(() -> twice = false,2000);
        twice = true;
    }

    //Funcion de verificacion de alumnos
    private void Verificacion() {
        if(!Preferencias.with(this).read(getCurrentTableName()).equals("true")) {
            Log.d("IngresAR","Fecha: "+getCurrentTableName());
            dbHelper.AñadirCursos(this);
            Log.d("IngresAR","Alumnos de Sexto B añadidos");
            Preferencias.with(this).write(getCurrentTableName(),"true");
        }
        ConstruirSentencia();
    }

    //Crear vista principal y dar funcion a los botones
    private void ConstruirSentencia() {
        mDBHelper = new dbHelper(MainActivity.this);
        //Establecer vista principal
        setContentView(R.layout.activity_main);
        //Asociar boton con el de la vista principal
        Ver = findViewById(R.id.showpbtn);
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
        Ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciar = new Intent(MainActivity.this, ActivityDates.class);
                startActivity(iniciar);
                finish();
            }
        });
    }

    //Verificar resultado de escaneo
    private void handleResult(IntentResult scanResult) {
        if (scanResult != null && scanResult.getContents().contains("@")) {
            updateUI(scanResult.getContents());
        } else {
            Toast.makeText(this, "No se ha leído nada :(", Toast.LENGTH_SHORT).show();
        }
    }

    //Dividir resultado y añadirlo a la base de datos
    private void updateUI(String scan_result) {
        mDBHelper = new dbHelper(MainActivity.this);
        String[] SPLIT = scan_result.split("@");
        String APPELLIDO = SPLIT[1];
        String NOMBRE = SPLIT[2];
        String SEXO = SPLIT[3];
        String DNI = SPLIT[4];
        Cursor result = mDBHelper.BuscarAlumno(DNI,this);
        Calendar calendar = Calendar.getInstance();
        int hour24hrs = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        while (result.moveToNext()){
            String RESULTADO = result.getString(result.getColumnIndex(NOMBRE_Y_APPELIDO_COL));
            dbHelper.IngresarAsistencia(DNI,"Presente",this);
            if(hour24hrs >= 8){
                Toast.makeText(this,RESULTADO + " TARDANZA",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,RESULTADO + " PRESENTE",Toast.LENGTH_SHORT).show();
            }
            return;
        } if (!result.moveToNext()){
            Toast.makeText(this,"No se ha podido encontrar a "+NOMBRE + " "+APPELLIDO,Toast.LENGTH_SHORT).show();
        }
    }

    //Obtener fecha actual
    private static String getCurrentTableName() {
        SimpleDateFormat currentDate = new SimpleDateFormat("dd-MM-YYYY");
        return "[" + currentDate.format(System.currentTimeMillis()) + "]";
    }

    //Actividad de resultado, aqui se obtiene el resultado de escaneo
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        final IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        handleResult(scanResult);
    }
}

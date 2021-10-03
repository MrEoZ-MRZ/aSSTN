package com.mrz.asstn;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setPrompt("Escanea el documento");
        Intent intent = integrator.createScanIntent();
        startActivityForResult(intent, 120);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 120 && requestCode != IntentIntegrator.REQUEST_CODE) {
            // This is important, otherwise the result will not be passed to the fragment
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        IntentResult result = IntentIntegrator.parseActivityResult(resultCode, data);
        if(resultCode == 120) {
            String Documento = result.getContents();
            Toast.makeText(MainActivity.this, Documento,Toast.LENGTH_LONG).show();
        }
    }
}
package com.mrz.asstn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText Correo;
    private EditText Contraseña;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Asociar variable correo con el EditText del layout de la app
        Correo = findViewById(R.id.Correo);
        //Asociar variable contraseña con el EditText del layout de la app
        Contraseña = findViewById(R.id.Contraseña);
        //Asociar variable Login con el boton en el layout
        Login = findViewById(R.id.login);
        //Dar una interaccion al tocar el boton login
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtener el texto del correo
                String correo = Correo.getText().toString();
                //Obtener el texto de la contraseña
                String contraseña = Contraseña.getText().toString();

                //Declarar cambio de actividades
                Intent asd = new Intent(LoginActivity.this, MainActivity.class);
                //Ejecutar cambio de actividades
                startActivity(asd);
                //Finalizar actividad principal
                finish();
            }
        });
    }
}
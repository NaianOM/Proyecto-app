package com.example.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        EditText nombre = findViewById(R.id.usuario_registro);
        EditText contrasena = findViewById(R.id.contrasena_usuario);
        EditText correo = findViewById(R.id.correo_usuario);
        EditText telefono = findViewById(R.id.telefono);
        EditText descrip = findViewById(R.id.descripcion);
    }
    public void Regresar(View view){
        Intent Regresar = new Intent(this, Login.class);
        startActivity(Regresar);
    }
}
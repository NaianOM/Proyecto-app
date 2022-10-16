package com.example.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Registrarse (View view){
        Intent registrarse = new Intent(this, Formulario.class);
        startActivity(registrarse);
    }
    public void Olvidocontrasena (View view){
        Intent Olvidocontrasena = new Intent(this, OlvideContrasena.class);
        startActivity(Olvidocontrasena);
    }
    public void Velogin (View view){
        Intent Velogin = new Intent(this, Login.class);
        startActivity(Velogin);
    }
}
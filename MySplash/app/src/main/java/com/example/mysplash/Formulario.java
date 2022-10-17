package com.example.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import java.io.Serializable;

public class Formulario extends AppCompatActivity implements Serializable {

    public String nombre;
    private String contrasena;
    private  String correo;
    private int telefono;
    private String fecha;
    private String descripcion;
    private float altura;
    private Boolean terminos;
    private Boolean politicas;
    private Boolean radio_si, radio_no;
    private Boolean enfermedad;

    public Boolean getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(Boolean enfermedad) {
        this.enfermedad = enfermedad;
    }
    public Boolean getRadio_no() {
        return radio_no;
    }
    public void setRadio_no(Boolean radio_no) {
        this.radio_no = radio_no;
    }
    public Boolean getRadio_si() {
        return radio_si;
    }
    public void setRadio_si(Boolean radio_si) {
        this.radio_si = radio_si;
    }
    public Boolean getPoliticas() {
        return politicas;
    }
    public void setPoliticas(Boolean politicas) {
        this.politicas = politicas;
    }
    public Boolean getTerminos() {
        return terminos;
    }
    public void setTerminos(Boolean terminos) {
        this.terminos = terminos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        EditText nombre = findViewById(R.id.usuario_registro);
        EditText contrasena = findViewById(R.id.contrasena_usuario);
        EditText correo = findViewById(R.id.correo_usuario);
        EditText telefono = findViewById(R.id.telefono);
        EditText descrip = findViewById(R.id.descripcion);
        CheckBox terminos = (CheckBox) findViewById(R.id.terminos);
        CheckBox politicas = (CheckBox) findViewById(R.id.politicas);
        RadioButton radio_si = (RadioButton) findViewById(R.id.radio_si);
        RadioButton radio_no = (RadioButton) findViewById(R.id.radio_no);
        Switch enfermedad = (Switch) findViewById(R.id.enfermedad);


    }
    public void Registrar(View view){
        Intent Registrar = new Intent(this, Login.class);

        Registrar.putExtra("radio_si", getRadio_si());
        Registrar.putExtra("radio_no", getRadio_no());
        Registrar.putExtra("enfermedad", getEnfermedad());
        if(nombre.length() != 0) {
            Registrar.putExtra("nombre", getNombre().toString());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar un nombre",Toast.LENGTH_LONG).show();
        }
        if(contrasena.length() != 0) {
            Registrar.putExtra("contrasena", getContrasena().toString());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar una contraseña",Toast.LENGTH_LONG).show();
        }
        if(correo.length() != 0) {
            Registrar.putExtra("correo", getCorreo().toString());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar una dirección de correo",Toast.LENGTH_LONG).show();
        }
        if(telefono != 0) {
            Registrar.putExtra("telefono", getTelefono());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar un número de teléfono",Toast.LENGTH_LONG).show();
        }
        if(fecha.length() != 0) {
            Registrar.putExtra("fecha", getFecha().toString());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar un número de teléfono",Toast.LENGTH_LONG).show();
        }

        if(descripcion.length() != 0) {
            Registrar.putExtra("descripcion", getDescripcion().toString());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar una pequeña descripción",Toast.LENGTH_LONG).show();
        }

        if(altura != 0) {
            Registrar.putExtra("altura", getAltura());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes ingresar tu altura",Toast.LENGTH_LONG).show();
        }

        if(terminos = true) {
            Registrar.putExtra("terminos", getTerminos());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes haber leído los términos y condiciiones",Toast.LENGTH_LONG).show();
        }
        if(politicas = true) {
            Registrar.putExtra("politicas", getPoliticas());
            startActivity(Registrar);
        } else{
            Toast.makeText(this,"Debes haber leído las políticas",Toast.LENGTH_LONG).show();
        }
    }
    public void Regresar(View view){
        Intent Regresar = new Intent(this, Login.class);
        startActivity(Regresar);
    }
}
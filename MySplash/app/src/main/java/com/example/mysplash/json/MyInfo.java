package com.example.mysplash.json;

import java.io.Serializable;

public class MyInfo implements Serializable {

    private String usuario_registro;
    private String contrasena_usuario;
    private  String correo_usuario;
    private int telefono;
    private String fecha;
    private String descripcion;
    private float altura;

    public String getUsuario_registro() {
        return usuario_registro;
    }

    public void setUsuario_registro(String usuario_registro) {
        this.usuario_registro = usuario_registro;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
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
}




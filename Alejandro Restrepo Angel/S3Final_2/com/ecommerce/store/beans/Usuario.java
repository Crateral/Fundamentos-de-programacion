package com.ecommerce.store.beans;

import java.io.Serializable;

public class Usuario implements Serializable {

    //Atributos
    private String id, nombre, apellido, correo, usuario, password;

    //Constructores
    public Usuario() {
        this.id = "";
        this.nombre = "";
        this.apellido = "";
        this.correo ="";
        this.usuario = "";
        this.password = "";
    }

    public Usuario(String id, String nombre, String apellido,String correo, String usuario, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
    }

    //Getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Método para imprimir en pantalla
    @Override
    public String toString() {
        return "Usuario{" +
                "Identificación='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

package com.ecommerce.store.beans;

import java.io.Serializable;

public class Usuario implements Serializable {

    //Atributos
    private String id, correo, usuario, password;
    private Rol rol;
    private Estado estado;

    //Constructores
    public Usuario() {
    }

    public Usuario(String id,String correo, String usuario, String password, Rol rol, Estado estado) {
        this.id = id;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
        this.estado = estado;
    }

    //Getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //Método para imprimir en pantalla
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", correo='" + correo + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }
}

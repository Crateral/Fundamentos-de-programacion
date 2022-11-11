package com.gymapp.app.beans;

import java.io.Serializable;
import java.util.Date;

public class Usuario extends Persona implements Serializable {

    //Atributos
    private Integer id;
    private String sexo;
    private Date FechaNacimiento;

    public Usuario() {

    }

    public Usuario(Integer id, String documento, String nombre, String apellido, String telefono, String correo, String usuario, String password, Integer id1, String sexo, Date fechaNacimiento) {
        super(id, documento, nombre, apellido, telefono, correo, usuario, password);
        this.id = id1;
        this.sexo = sexo;
        FechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", sexo='" + sexo + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                '}';
    }
}

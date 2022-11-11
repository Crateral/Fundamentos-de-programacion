package com.gymapp.app.beans;

import java.io.Serializable;
import java.util.Date;

public class Clase implements Serializable {

    private Integer id;
    private String nombre;
    private Integer cupos;
    private Date FechaClase;

    public Clase() {

    }

    public Clase(Integer id, String nombre, Integer cupos, Date fechaClase) {
        this.id = id;
        this.nombre = nombre;
        this.cupos = cupos;
        FechaClase = fechaClase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public Date getFechaClase() {
        return FechaClase;
    }

    public void setFechaClase(Date fechaClase) {
        FechaClase = fechaClase;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cupos=" + cupos +
                ", FechaClase=" + FechaClase +
                '}';
    }
}

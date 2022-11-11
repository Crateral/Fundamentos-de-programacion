package com.gymapp.app.beans;

import java.io.Serializable;

public class Rutina implements Serializable {

    private Integer id;
    private String nombre;
    private Integer tiempo;

    public Rutina() {
    }

    public Rutina(Integer id, String nombre, Integer tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = tiempo;
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

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}

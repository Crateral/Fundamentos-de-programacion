package com.gymapp.app.beans;

import java.io.Serializable;
import java.util.Date;

public class Ejercicio implements Serializable {

    //Atributos
    private Integer id;
    private String nombre;
    private Integer duracion, serie;

    public Ejercicio() {
    }

    public Ejercicio(Integer id, String nombre, Integer duracion, Integer serie) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.serie = serie;
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

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Ejercicio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", serie=" + serie +
                '}';
    }
}

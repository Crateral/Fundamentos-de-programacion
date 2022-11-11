package com.gymapp.app.beans;

import java.io.Serializable;
import java.util.Date;

public class Imc implements Serializable {

    //Atributos
    private Integer id;
    private Float peso, altura, imc ;
    private Date FechaCalculo;

    public Imc() {
    }

    public Imc(Integer id, Float peso, Float altura, Float imc, Date fechaCalculo) {
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        FechaCalculo = fechaCalculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public Date getFechaCalculo() {
        return FechaCalculo;
    }

    public void setFechaCalculo(Date fechaCalculo) {
        FechaCalculo = fechaCalculo;
    }

    @Override
    public String toString() {
        return "Imc{" +
                "id=" + id +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc=" + imc +
                ", FechaCalculo=" + FechaCalculo +
                '}';
    }
}

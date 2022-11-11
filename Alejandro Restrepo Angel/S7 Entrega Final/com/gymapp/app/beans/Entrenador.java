package com.gymapp.app.beans;

import java.io.Serializable;

public class Entrenador extends Persona implements Serializable {

    //Atributos
    private Integer id;
    private String arl, eps;
    private Double salario;

    public Entrenador() {
        super();
    }

    public Entrenador(Integer id, String documento, String nombre, String apellido, String telefono, String correo, String usuario, String password, Integer id1, String arl, String eps, Double salario) {
        super(id, documento, nombre, apellido, telefono, correo, usuario, password);
        this.id = id1;
        this.arl = arl;
        this.eps = eps;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", arl='" + arl + '\'' +
                ", eps='" + eps + '\'' +
                ", salario=" + salario +
                '}';
    }
}

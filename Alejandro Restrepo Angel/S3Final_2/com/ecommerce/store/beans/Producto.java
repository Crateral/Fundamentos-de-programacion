package com.ecommerce.store.beans;

import java.io.Serializable;

public class Producto implements Serializable {

    //Atributos
    public final String[] categorias={"Mercado", "Tecnología", "Hogar", "Moda", "Ferreteria", "Farmacia"};

    private int codigo, precio;

    private String nombre, categoria, observacion;

    //Constructores
    public Producto() {
        this.codigo = 0;
        this.nombre = "";
        this.categoria = "";
        this.observacion = "";
        this.precio = 0;
    }

    public Producto(int codigo, String nombre, int idCategoria, String observacion, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = this.categorias[idCategoria];
        this.observacion = observacion;
        this.precio = precio;
    }

    //Getter y setter
    public String[] getCategorias() {
        return categorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Método para imprimir en pantalla
    @Override
    public String toString() {
        return "Producto{" +
                "categoria='" + categoria + '\'' +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}

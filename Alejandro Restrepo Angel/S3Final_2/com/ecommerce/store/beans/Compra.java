package com.ecommerce.store.beans;

import java.io.Serializable;

public class Compra implements Serializable {

    //Atributos
    private Producto producto;
    private int cantidad;
    private double subtotal;

    //Constructores
    public Compra() {
        this.producto = new Producto();
        this.cantidad = 0;
        this.subtotal = 0.0;
    }

    public Compra(Producto producto) {
        this.producto = producto;
        this.cantidad = 0;
        this.subtotal = 0.0;
    }

    public Compra(Producto producto, int cantidad, double subtotal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    //Getter y setter
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    //Método para imprimir en pantalla
    @Override
    public String toString() {
        return "Compra{" +
                producto +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }
}

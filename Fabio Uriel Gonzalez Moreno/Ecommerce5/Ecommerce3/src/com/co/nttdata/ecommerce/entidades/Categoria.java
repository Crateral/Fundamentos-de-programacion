package com.co.nttdata.ecommerce.entidades;

public enum Categoria {
    ELETRODOMESTICOS(1,"Electrodomestico",true,0.10),
    TECNOLOGIA(2,"Tecnologia",true,0.10),
    ROPA(3,"Ropa",false,0),
    DEPORTES(4,"Deportes",true,0.20),
    JUGUETERIA(5,"Jugueteria",true,0.50),
    ACCESORIOS(6,"Accesorios",true,0.10);




    private int idCategoria;
    private String descripcion;
    private boolean descuento;
    private double valorDescuento;

    Categoria() {
    }

    Categoria(int idCategoria, String descripcion, boolean descuento, double valorDescuento) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.valorDescuento = valorDescuento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
}

package com.co.nttdata.ecommerce.entidades;



public enum Marca {

    SAMSUNG(1, "Productos Samsung"),
    ASUS(2, "Productos LG"),
    OFFCORSS(3, "Ropa OffCorrs"),
    GOLTY(4, "Productos deportivos"),
    MATTEL(5,"Juguetes"),
    VERTEBIEN(6, "Accesorios Dama y CAballero");



    private int id;
    private String propiedades;

    Marca() {
    }

    Marca(int id, String propiedades) {
        this.id = id;
        this.propiedades = propiedades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(String propiedades) {
        this.propiedades = propiedades;
    }
}


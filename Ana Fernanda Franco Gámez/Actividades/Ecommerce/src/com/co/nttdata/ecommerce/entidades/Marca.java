package com.co.nttdata.ecommerce.entidades;

public enum Marca {

    LG(1, "Marca LG"),
    SAMSUNG(2, "Marca Samsung "),
    KIA(3, "Marca Kia "),
    STUDIOF(4, "Marca de Ropa StudioF"),
    CANAMOR(5, "Marca de Productos Canamor"),
    IPHONE(6, "Marca de Prodductos Iphone"),
    DISTRIHOGAR(7, "Marca de Productos DistriHogar"),
    ADIDAS(8, "Marca de Productos Adidas"),
    VELEZ(9, "Marca de Productos Velez"),

    DISNEY(9, "Marca de juguetes Disney");

    private int id;
    private String descripcion;

    private Marca(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

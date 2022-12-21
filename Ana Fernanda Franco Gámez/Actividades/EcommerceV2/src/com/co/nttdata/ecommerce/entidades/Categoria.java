package com.co.nttdata.ecommerce.entidades;

public enum Categoria {

    ELECTRODOMESTICOS(1, "Electrodomestico", "Electrodomestico 10/10", true, 0.10),
    TECNOLOGIA(2, "Tecnologia", "Articulos de Tecnologia ", true, 0.10),
    ROPA(3, "Ropa", "Prendas de vestir", false, 0.15),
    MASCOTAS(4, "Mascotas", "Productos para mascotas", false, 0.05),
    HOGAR(5, "hogar", "Muebles y mas", true, 0.12),
    DEPORTES(6, "Depostes", "Todo lo relacionado con deporte", false, 0),
    JUGUETERIA(7, "Jugueteria", "Articulos de Jugueteria ", true, 0.10),
    ACCESORIOS(8, "Accesorios", "Todo lo relacionado con accesorios", true, 0.12);

    private int idCategoria;
    private String nombre;
    private String descripcion;
    private boolean descuento;
    private double valorDescuento;

    Categoria(int idCategoria, String nombre, String descripcion, boolean descuento, double valorDescuento) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

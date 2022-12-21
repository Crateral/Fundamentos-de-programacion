package com.co.nttdata.ecommerce.entidades;

public class Producto {

    private int idProducto;
    private String nombre;
    private int cantidadDiponible;
    private double precio;
    private boolean descuento;
    private double valorDescuento;
    private double iva;
    private String descripcion;
    private String img;
    private Marca marca;
    private Categoria categoria;

    public Producto() {

    }

    public Producto(int idProducto, String nombre, int cantidadDiponible, double precio, boolean descuento, double iva,
                    String descripcion, String img, Marca marca, Categoria categoria) {
        super();
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadDiponible = cantidadDiponible;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
        this.descripcion = descripcion;
        this.img = img;
        this.marca = marca;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDiponible() {
        return cantidadDiponible;
    }

    public void setCantidadDiponible(int cantidadDiponible) {
        this.cantidadDiponible = cantidadDiponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
package com.co.nttdata.ecommerce.entidades;

import java.util.Date;

public class Factura {
    private int idFactura;
    private Date fecha;
    private Empresa empresa;
    private Cliente cliente;
    private String descripcion;
    private CarritoDeCompras carritoDeCompras;
    private double valorTotalSinIva;
    private double valorTotalConIva;
    private double valorDeEnvio;

    public Factura() {
    }

    public Factura(int idFactura, Date fecha, Empresa empresa, Cliente cliente, String descripcion, CarritoDeCompras carritoDeCompras, double valorTotalSinIva, double valorTotalConIva, double valorDeEnvio) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.empresa = empresa;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.carritoDeCompras = carritoDeCompras;
        this.valorTotalSinIva = valorTotalSinIva;
        this.valorTotalConIva = valorTotalConIva;
        this.valorDeEnvio = valorDeEnvio;
    }

    public int getIdFactura() {
        return this.idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CarritoDeCompras getProductos(CarritoDeCompras cdc) {
        cdc.getProductos().forEach(producto -> System.out.println(producto.getNombre()+"--------    "+producto.getDescripcion()+"--------   "+producto.getPrecio()));
        return this.carritoDeCompras;
    }

    public void setProductos(CarritoDeCompras carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
    }

    public double getValorTotalSinIva() {
        return this.valorTotalSinIva;
    }

    public void setValorTotalSinIva(double valorTotalSinIva) {
        this.valorTotalSinIva = valorTotalSinIva;
    }

    public double getValorTotalConIva() {
        return this.valorTotalConIva;
    }

    public void setValorTotalConIva(double valorTotalConIva) {
        this.valorTotalConIva = valorTotalConIva;
    }

    public CarritoDeCompras getCarritoDeCompras() {
        return this.carritoDeCompras;
    }

    public void setCarritoDeCompras(CarritoDeCompras carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
    }

    public double getValorDeEnvio() {
        return this.valorDeEnvio;
    }

    public void setValorDeEnvio(double valorDeEnvio) {
        this.valorDeEnvio = valorDeEnvio;
    }
}

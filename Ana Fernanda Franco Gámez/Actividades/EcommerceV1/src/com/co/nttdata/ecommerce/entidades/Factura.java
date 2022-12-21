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

    public Factura() {

    }

    public Factura(int idFactura, Date fecha, Empresa empresa, Cliente cliente, String descripcion,
                   CarritoDeCompras carritoDeCompras, double valorTotalSinIva, double valorTotalConIva) {
        super();
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.empresa = empresa;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.carritoDeCompras = carritoDeCompras;
        this.valorTotalSinIva = valorTotalSinIva;
        this.valorTotalConIva = valorTotalConIva;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CarritoDeCompras getProductos() {
        return carritoDeCompras;
    }

    public void setProductos(CarritoDeCompras carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
    }

    public double getValorTotalSinIva() {
        return valorTotalSinIva;
    }

    public void setValorTotalSinIva(double valorTotalSinIva) {
        this.valorTotalSinIva = valorTotalSinIva;
    }

    public double getValorTotalConIva() {
        return valorTotalConIva;
    }

    public void setValorTotalConIva(double valorTotalConIva) {
        this.valorTotalConIva = valorTotalConIva;
    }

}

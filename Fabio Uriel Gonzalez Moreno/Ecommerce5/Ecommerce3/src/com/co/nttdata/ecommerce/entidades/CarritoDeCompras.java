package com.co.nttdata.ecommerce.entidades;
import com.co.nttdata.ecommerce.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarritoDeCompras {

    private int idCarritoDeCompras;
    private Date fecha;
    private List<Producto> productos;
    private double subTotalConIva;
    private double subTotaSinIva;
    private double valorEnvio;

    public CarritoDeCompras() {
    }

    public CarritoDeCompras(int idCarritoDeCompras, Date fecha, List<Producto> productos, double subTotalConIva, double subTotaSinIva, double valorEnvio) {
        this.idCarritoDeCompras = idCarritoDeCompras;
        this.fecha = fecha;
        this.productos = productos;
        this.subTotalConIva = subTotalConIva;
        this.subTotaSinIva = subTotaSinIva;
        this.valorEnvio = valorEnvio;
    }

    public int getIdCarritoDeCompras() {
        return idCarritoDeCompras;
    }

    public void setIdCarritoDeCompras(int idCarritoDeCompras) {
        this.idCarritoDeCompras = idCarritoDeCompras;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getSubTotalConIva() {
        return subTotalConIva;
    }

    public void setSubTotalConIva(double subTotalConIva) {
        this.subTotalConIva = subTotalConIva;
    }

    public double getSubTotaSinIva() {
        Producto pro= new Producto();
        return getSubTotalConIva();
    }

    public void setSubTotaSinIva(double subTotaSinIva) {
        this.subTotaSinIva = subTotaSinIva;
    }

    public double getValorEnvio() {

        return valorEnvio;
    }

    public void setValorEnvio(double valorEnvio) {
        this.valorEnvio = valorEnvio;
    }
}
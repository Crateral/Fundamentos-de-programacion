package com.co.nttdata.ecommerce.entidades;

public class Empresa {

    private int nitEmpresa;
    private String nombreEmpresa;
    private String logo;
    private String direccion;
    private String telefono;

    public Empresa(int nitEmpresa, String nombreEmpresa, String logo, String direccion, String telefono) {
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.logo = logo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Empresa() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

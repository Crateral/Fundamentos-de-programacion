package com.co.nttdata.ecommerce.entidades;

public class Cliente extends Usuario {

    private String numeroIdentificacion;
    private String tipoIdentificacion;
    private String correo;
    private String telefono;
    private String direccion;
    private String ciudad;
    private boolean estado;
    private String metodoDePago;


    public Cliente() {
        super();
    }

    public Cliente(int id, String nombreUsuario, String contrasenia, String numeroIdentificacion,
                   String tipoIdentificacion, String correo, String telefono, String direccion, String ciudad, boolean estado,
                   String metodoDePago) {
        super(id, nombreUsuario, contrasenia);
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.metodoDePago = metodoDePago;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Cliente(int id, String nombreUsuario, String contrasenia) {
        super(id, nombreUsuario, contrasenia);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "Cliente [correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", estado="
                + estado + ", numeroIdentificacion=" + numeroIdentificacion + ", tipoIdentificacion="
                + tipoIdentificacion + ", metodoDePago=" + metodoDePago + "]";
    }
}

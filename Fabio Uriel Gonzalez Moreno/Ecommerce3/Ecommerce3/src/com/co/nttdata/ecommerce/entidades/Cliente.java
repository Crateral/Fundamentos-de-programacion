package com.co.nttdata.ecommerce.entidades;

public class Cliente extends Usuario{

    private String correo;
    private String telefono;
    private String direccion;
    private boolean estado;
    private String numeroIdentificacion;
    private String tipoIdentificacion;
    private String metodoDePago;

    private String ciudad;



    public Cliente() {
        super();
    }

    public Cliente(int id,String nombre,String correo, String telefono, String direccion, boolean estado, String numeroIdentificacion,
                   String tipoIdentificacion, String metodoDePago,String ciudad) {
        super();
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.metodoDePago = metodoDePago;
        this.ciudad=ciudad;
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

    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(){
        this.ciudad=ciudad;
    }

    @Override
    public String toString() {
        return "Cliente [correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", estado="
                + estado + ", numeroIdentificacion=" + numeroIdentificacion + ", tipoIdentificacion="
                + tipoIdentificacion + ", metodoDePago=" + metodoDePago + "]";
    }

   }

package com.co.nttdata.ecommerce.entidades;

public class Cliente extends Usuario {

    private String numeroIdentificacion;
    private TipoDocumento tipoIdentificacion;
    private String correo;
    private String telefono;
    private String direccion;
    private String ciudad;
    private boolean estado;
    private MetodoPago metodoDePago;


    public Cliente() {
        super();
    }

    public Cliente(int id, String nombreUsuario, String contrasenia, TipoDocumento tipoIdentificacion,
                   String numeroIdentificacion, String correo, String telefono, String direccion, String ciudad,
                   boolean estado, MetodoPago metodoDePago) {
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

    public TipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public MetodoPago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoPago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "[ -Id Usuario:" + getId() + " -Nombre: " + getNombreUsuario() + " -Tipo identificacion: " + getTipoIdentificacion() +
                " -Numero identificacion: " + getNumeroIdentificacion() + " -Correo: " + getCorreo() + " -Contraseña " + getContrasenia() +
                " -Direccion: " + getDireccion() + " Ciudad: " + getCiudad() + " -Telefono: " + getTelefono() +
                " -Metodo Pago " + getMetodoDePago() + " ]";
    }
}

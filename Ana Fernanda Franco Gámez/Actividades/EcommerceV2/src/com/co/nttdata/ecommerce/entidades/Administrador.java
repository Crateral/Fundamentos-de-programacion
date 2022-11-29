package com.co.nttdata.ecommerce.entidades;

public class Administrador extends Usuario {

    private String correo;
    private boolean estado;
    private String numeroIdentificacion;
    private TipoDocumento tipoIdentificacion;

    public Administrador() {
        super();
    }

    public Administrador(String correo, boolean estado, TipoDocumento tipoIdentificacion, String numeroIdentificacion) {
        super();
        this.correo = correo;
        this.estado = estado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Administrador(int id, TipoDocumento tipoIdentificacion, String numeroIdentificacion, String nombreUsuario, String correo, String contrasenia, boolean estado) {
        super(id, nombreUsuario, contrasenia);
        this.correo = correo;
        this.estado = estado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Administrador(int id, String nombreUsuario, String contrasenia) {
        super(id, nombreUsuario, contrasenia);
        // TODO Auto-generated constructor stub
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean getEstado() {
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

    @Override
    public String toString() {
        return "[ -Id Usuario:" + getId() + " -Nombre: " + getNombreUsuario() + " -Tipo identificacion: " + getTipoIdentificacion() +
                " -Numero identificacion: " + getNumeroIdentificacion() + " -Correo: " + getCorreo() + " -Contraseña "
                + getContrasenia() + "-Estado: " + getEstado() + " ]";
    }
}

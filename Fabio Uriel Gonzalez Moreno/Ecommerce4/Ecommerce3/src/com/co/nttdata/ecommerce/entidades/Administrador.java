package com.co.nttdata.ecommerce.entidades;

public class Administrador extends Usuario{

    private String correo;
    private boolean estado;
    private String numeroIdentificacion;
    private String tipoIdentificacion;

    public Administrador() {
        super();
    }

    public Administrador(String correo, boolean estado, String numeroIdentificacion, String tipoIdentificacion) {
        super();
        this.correo = correo;
        this.estado = estado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Administrador(int id, String nombreUsuario, String contrasenia) {
        super(id, 1, nombreUsuario, contrasenia, "", "");
        // TODO Auto-generated constructor stub
    }



    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

}

package com.co.nttdata.ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    List<Usuario> listusuarios = new ArrayList<>();
    Scanner entrada=new Scanner(System.in);
    private int id;
    private int idAdministrador;
    private String nombreUsuario;
    private String contrasenia;
    private String nombreAdministrador;
    private String contraseniaAdministrador;

    public Usuario() {

    }

    public Usuario(int id, int idAdministrador, String nombreUsuario, String contrasenia, String nombreAdministrador, String contraseniaAdministrador) {
        super();
        this.id = id;
        this.idAdministrador = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.nombreAdministrador = nombreAdministrador;
        this.contraseniaAdministrador = contraseniaAdministrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getContraseniaAdministrador() {
        return contraseniaAdministrador;
    }

    public void setContraseniaAdministrador(String contraseniaAdministrador) {
        this.contraseniaAdministrador = contraseniaAdministrador;
    }



    @Override
    public String toString() {
        return "Usuario{" +
                "listusuarios=" + listusuarios +
                ", entrada=" + entrada +
                ", id=" + id +
                ", idAdministrador=" + idAdministrador +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", nombreAdministrador='" + nombreAdministrador + '\'' +
                ", contraseniaAdministrador='" + contraseniaAdministrador + '\'' +
                '}';
    }
}

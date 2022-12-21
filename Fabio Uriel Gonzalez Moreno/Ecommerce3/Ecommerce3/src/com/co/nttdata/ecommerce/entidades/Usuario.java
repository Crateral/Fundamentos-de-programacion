package com.co.nttdata.ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    List<Usuario> listusuarios = new ArrayList<>();
    Scanner entrada=new Scanner(System.in);
    private int id;
    private String nombreUsuario;
    private String contrasenia;

    public Usuario() {

    }

    public Usuario(int id, String nombreUsuario, String contrasenia) {
        super();
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void registro(Cliente usuario1,Cliente cliente){



        String nombre,correo,contrasenia;
        Scanner entrada= new Scanner(System.in);


        System.out.println("Complete datos de usuario para registro");
        System.out.println("Ingrese nombre completo: ");
        usuario1.setNombreUsuario(entrada.nextLine());


        System.out.println("Ingrese el correo");
        usuario1.setCorreo(entrada.nextLine());

        System.out.println("Ingrese contraseña");
       usuario1.setContrasenia(entrada.nextLine());


       listusuarios.add(usuario1);

        System.out.println("Usuario creado correctamente ");



    }
    public void inicioSesion(Cliente usuario1,Cliente cliente){
        String nombre, contrasena, correo;

        System.out.println("DIGITE SUS CREDENCIALES");
        System.out.println("Usuario: ");
        correo = entrada.next();
        System.out.println("Contraseña");
        contrasena = entrada.next();
        for (Usuario usuario :listusuarios) {
            if (usuario1.getCorreo().equals(correo) && usuario1.getContrasenia().equals(contrasena)) {
                System.out.println("----SESION INICIADA----");
            } else {
                System.out.println("Los datos no son validos ");
            }
        }
    }


}


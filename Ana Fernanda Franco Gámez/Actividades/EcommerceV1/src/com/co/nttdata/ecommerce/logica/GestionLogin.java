package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.Administrador;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Usuario;

import java.util.Scanner;

public class GestionLogin {
    Scanner x = new Scanner(System.in);
    Usuario us = new Usuario();
    int opcion = 0;

    public Usuario crearUsuario(Usuario nu) {
        System.out.println("Creando usuario...");
        return nu;
    }

    public void consultarUsuario(Usuario con) {
        System.out.println("Usuario registrado Exitosamente: " + con.toString());
    }

    public Usuario loguinUsuario(Usuario us1, String usu, String con) {

        us.setNombreUsuario(usu);
        us.setContrasenia(con);

        if (us.getNombreUsuario().equals(us1.getNombreUsuario()) && us.getContrasenia().equals(us1.getContrasenia())) {

            System.out.println("Ingresando al sistema...");
            System.out.println("⏳");
            System.out.println("Bienvenido al sistema: " + us1.getNombreUsuario());

        } else {
            System.out.println("Credenciales incorrectas");
            System.out.println("Olvidaste tu contraseña Si[1], No[2]");
            opcion = x.nextInt();

            switch (opcion) {
                case 1:
                    cambiarContraseña(us1);
                    break;
                default:
                    System.out.println(" ");
            }
        }

        return us;
    }

    public Usuario cambiarContraseña(Usuario us1) {
        if (us.getNombreUsuario().equals(us1.getNombreUsuario())) {

            System.out.print("Ingresa tu nueva contraseña: ");
            us1.setContrasenia(x.next());


            System.out.println("Cambio de contraseña exitosa ✔ ");

            System.out.println("Ingresa nuevamente al sistema con tus credenciasles actualizadas ");

        } else {
            System.out.println("❌ El usuario [" + us.getNombreUsuario() + "] No se encuentra registrado");
        }
        return us;
    }
}

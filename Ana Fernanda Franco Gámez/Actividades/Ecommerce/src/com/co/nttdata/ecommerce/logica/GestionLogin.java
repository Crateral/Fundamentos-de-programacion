package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.Administrador;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Usuario;

import java.util.Scanner;

public class GestionLogin {
    Scanner x = new Scanner(System.in);
    Usuario us = new Usuario();
    int opcion = 0;

    public void crearUsuario(Cliente uc, Administrador ua) {
        us.setId(123);
        System.out.println("Que tipo de usuario quieres crear: Cliente [1], Administrador [2]");
        opcion = x.nextInt();
        if (opcion == 1) {
            us.setNombreUsuario(uc.getCorreo());
            us.setContrasenia(uc.getContrasenia());
            System.out.println("Usuario Cliente registrado");
        } else if (opcion == 2) {
            us.setNombreUsuario(ua.getCorreo());
            us.setContrasenia(ua.getContrasenia());
            System.out.println("Usuario Administrador registrado");
        } else {
            System.out.println("la opcion que digitaste no es valida");
        }

    }

    public Usuario loguinUsuario(Cliente usc, Administrador usa) {
        //    if (us.getNombreUsuario().isEmpty()){

        System.out.println("Ingrese sus credenciales");
        System.out.print("👩| Correo Usuario: ");
        us.setNombreUsuario(x.next());
        System.out.print("🔑| Contraseña: ");
        us.setContrasenia(x.next());

        if (us.getNombreUsuario().equals(usc.getCorreo()) && us.getContrasenia().equals(usc.getContrasenia()) ||
                us.getNombreUsuario().equals(usa.getCorreo()) && us.getContrasenia().equals(usa.getContrasenia())) {

            System.out.println("Ingresando al sistema...");
            System.out.println("⏳");
            if (us.getNombreUsuario().equals(usc.getCorreo()) && us.getContrasenia().equals(usc.getContrasenia())) {
                System.out.println("Bienvenido al sistema: " + usc.getNombreUsuario());
            } else {
                System.out.println("Bienvenido al sistema Adm: " + usa.getNombreUsuario());
            }
        } else {
            System.out.println("Credenciales incorrectas");
            System.out.println("Olvidaste tu contraseña Si[1], No[2]");
            opcion = x.nextInt();

            switch (opcion) {
                case 1:
                    cambiarContraseña(usc, usa);
                    break;
                default:
                    System.out.println(" ");
            }
        }
       /* }else {
            System.out.println("Aun no tienes usuarios registrados");
        }*/
        return us;
    }

    public Usuario cambiarContraseña(Cliente cl, Administrador ad) {
        if (us.getNombreUsuario().equals(cl.getCorreo()) || us.getNombreUsuario().equals(ad.getCorreo())) {
            //    System.out.println("sirve " + cl.getNombreUsuario());
            System.out.print("Ingresa tu nueva contraseña: ");
            cl.setContrasenia(x.next());
            // ad.setContrasenia(x.next());

            System.out.println("Cambio de contraseña exitosa ✔ ");

            System.out.println("Ingresa nuevamente al sistema con tus credenciasles actualizadas ");
            //  loguinUsuario(cl,ad);
        } else {
            System.out.println("❌ El usuario [" + us.getNombreUsuario() + "] No se encuentra registrado");
        }
        return us;
    }
}

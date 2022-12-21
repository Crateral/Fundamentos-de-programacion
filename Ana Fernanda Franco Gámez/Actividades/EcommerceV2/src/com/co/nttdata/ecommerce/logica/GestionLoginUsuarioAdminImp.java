package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.interfaces.GestionUsuario;

import java.util.Scanner;

public class GestionLoginUsuarioAdminImp implements GestionUsuario {
    Scanner x = new Scanner(System.in);
    int opcion;
    Administrador adm = new Administrador();

    @Override
    public Usuario crearUsuario(int id, String nombre, String contrasenia, TipoDocumento tipoIdentificacion, String numeroIdentificacion, String correo, String telefono, String direccion, String ciudad, boolean estado, MetodoPago metodoPago) {
        System.out.println("Registrando Administrador👨...");
        adm.setId(id);
        adm.setNombreUsuario(nombre);
        adm.setContrasenia(contrasenia);
        adm.setTipoIdentificacion(tipoIdentificacion);
        adm.setNumeroIdentificacion(numeroIdentificacion);
        adm.setCorreo(correo);
        adm.setContrasenia(contrasenia);
        adm.setEstado(estado);
        System.out.println(" Administrador registrado ✔");

        return adm;
    }

    @Override
    public void consultarUsuario() {
        System.out.println("Lista de Administradores");
        System.out.println("Datos: " + adm.toString());
    }

    @Override
    public Usuario loguinUsuario(Usuario us2, String usu, String con) {

        if (us2.getNombreUsuario().equals(usu) && us2.getContrasenia().equals(con)) {

            System.out.println("Ingresando al sistema...");
            System.out.println("⏳");
            System.out.println("Bienvenido al sistema Admin: " + adm.getNombreUsuario());

        } else {
            System.out.println("Credenciales incorrectas");
            System.out.println("Olvidaste tu contraseña Si[1], No[2]");
            opcion = x.nextInt();

            if (opcion == 1) {
                cambiarContraseña(us2, usu);
            } else {
                if (us2.getNombreUsuario().equals(usu)) {
                    System.out.println("Digita nuevamente tu contraseña");
                    con = x.next();

                    if (us2.getNombreUsuario().equals(usu) && us2.getContrasenia().equals(con)) {

                        System.out.println("Ingresando al sistema...");
                        System.out.println("⏳");
                        System.out.println("Bienvenido al sistema: " + adm.getNombreUsuario());

                    } else {
                        System.out.println("Has exedido el numero de intentos permitidos por favor cambia tu contraseña");
                        cambiarContraseña(us2, usu);
                    }
                } else {
                    System.out.println("❌ El usuario [" + usu + "] No se encuentra registrado");
                }

            }

        }
        return us2;
    }

    @Override
    public Usuario cambiarContraseña(Usuario us2, String usu) {
        if (us2.getNombreUsuario().equals(usu)) {
            System.out.print("Ingresa tu nueva contraseña: ");
            us2.setContrasenia(x.next());
            System.out.println("Cambio de contraseña exitosa ✔ ");

            System.out.println("Ingresa nuevamente al sistema con tus credenciasles actualizadas ");

        } else {
            System.out.println("❌ El usuario [" + usu + "] No se encuentra registrado");
        }

        return us2;
    }
}

package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.MetodoPago;
import com.co.nttdata.ecommerce.entidades.TipoDocumento;
import com.co.nttdata.ecommerce.entidades.Usuario;
import com.co.nttdata.ecommerce.interfaces.GestionUsuario;

import java.util.Scanner;

public class GestionLoginUsuarioClienteImp implements GestionUsuario {
    Cliente nc = new Cliente();
    Scanner x = new Scanner(System.in);
    int opcion;

    @Override
    public Usuario crearUsuario(int id, String nombre, String contrasenia, TipoDocumento tipoIdentificacion, String numeroIdentificacion,
                                String correo, String telefono, String direccion, String ciudad, boolean estado, MetodoPago metodoPago) {
        System.out.println("Registrando Cliente👨...");
        System.out.println();
        nc.setId(id);
        nc.setNombreUsuario(nombre);
        nc.setContrasenia(contrasenia);
        nc.setTipoIdentificacion(tipoIdentificacion);
        nc.setNumeroIdentificacion(numeroIdentificacion);
        nc.setCorreo(correo);
        nc.setTelefono(telefono);
        nc.setDireccion(direccion);
        nc.setCiudad(ciudad);
        nc.setEstado(estado);
        nc.setMetodoDePago(metodoPago);
        System.out.println("Usuario registrado ✔");
        return nc;

    }


    @Override
    public void consultarUsuario() {
        System.out.println("lista usuario Cliente: ");
        System.out.println("Datos: " + nc.toString());

    }

    @Override
    public Usuario loguinUsuario(Usuario us1, String usu, String con) {

        if (us1.getNombreUsuario().equals(usu) && us1.getContrasenia().equals(con)) {

            System.out.println("Ingresando al sistema...");
            System.out.println("⏳");
            System.out.println("Bienvenido al sistema: " + nc.getNombreUsuario());

        } else {
            System.out.println("Credenciales incorrectas");
            System.out.println("Olvidaste tu contraseña Si[1], No[2]");
            opcion = x.nextInt();

            if (opcion == 1) {
                cambiarContraseña(us1, usu);
            } else {
                if (us1.getNombreUsuario().equals(usu)) {
                    System.out.println("Digita nuevamente tu contraseña");
                    con = x.next();

                    if (us1.getNombreUsuario().equals(usu) && us1.getContrasenia().equals(con)) {

                        System.out.println("Ingresando al sistema...");
                        System.out.println("⏳");
                        System.out.println("Bienvenido al sistema: " + nc.getNombreUsuario());

                    } else {
                        System.out.println("Has exedido el numero de intentos permitidos por favor cambia tu contraseña");
                        cambiarContraseña(us1, usu);
                    }
                } else {
                    System.out.println("❌ El usuario [" + usu + "] No se encuentra registrado");
                }

            }

        }

        return us1;
    }

    @Override
    public Usuario cambiarContraseña(Usuario us1, String usu) {
        if (us1.getNombreUsuario().equals(usu)) {
            System.out.print("Ingresa tu nueva contraseña: ");
            us1.setContrasenia(x.next());
            System.out.println("Cambio de contraseña exitosa ✔ ");

            System.out.println("Ingresa nuevamente al sistema con tus credenciasles actualizadas ");

        } else {
            System.out.println("❌ El usuario [" + usu + "] No se encuentra registrado");
        }
        return us1;
    }
}

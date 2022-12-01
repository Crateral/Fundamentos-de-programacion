package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.Administrador;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.interfaces.IGestionLogin;

import java.util.Scanner;

public class GestionLogin implements IGestionLogin {
    Scanner entrada = new Scanner(System.in);
    String usuarioEscanner;
    String contraseniaEscaner;
    //System.out.println(usuario.getNombreUsuario() + " " + usuario.getContrasenia());// prueba

    int registroId;

    @Override
    public void registrUsuario(Cliente cliente, Administrador administrador) {
        int opcion1 = 0;

        System.out.println("Registrarse como: [1] Administrador  [2] Cliente");
        opcion1 = entrada.nextInt();
        String registroAdministrador;
        String registroUsuario;


        switch (opcion1) {
            case 1:
                System.out.println("Digite su número de Cédula");
                registroId = entrada.nextInt();
                administrador.setIdAdministrador(registroId);
                System.out.print("Digite nombre de Administrador: ");
                registroAdministrador = entrada.next();
                administrador.setNombreAdministrador(registroAdministrador);
                System.out.print("Digite contraseña de Administrador: ");
                registroAdministrador = entrada.next();
                administrador.setContraseniaAdministrador(registroAdministrador);
                System.out.println("Registro EXitoso");
                break;

            case 2:
                System.out.println("Digite su número de Cédula");
                registroId = entrada.nextInt();
                cliente.setId(registroId);
                System.out.print("Digite su nombre de Usuario: ");
                registroUsuario = entrada.next();
                cliente.setNombreUsuario(registroUsuario);
                System.out.print("Digite su Contraseña: ");
                registroUsuario = entrada.next();
                cliente.setContrasenia(registroUsuario);
                System.out.println("Registro EXitoso");
                break;

            default:
                break;
        }
    }

    @Override
    public void inicioDeSesion(Cliente cliente, Administrador administrador) {
        int opcion = 0;
        System.out.println("INICIAR SESION como: [1] Administrador [2] Cliente");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("|👨🏻|   Ingrese usuario Administrador");
                usuarioEscanner = entrada.next();
                System.out.println("|🗝|Ingrese contraseña");
                contraseniaEscaner = entrada.next();

                if (administrador.getNombreAdministrador().equals(usuarioEscanner) && administrador.getContraseniaAdministrador().
                        equals(contraseniaEscaner)) {
                    System.out.println("👨🏻‍💻 Bienvenido Administrador " + administrador.getNombreAdministrador());
                } else {
                    System.out.println("usuario o contraseña incorrectos");
                }
                break;

            case 2:
                System.out.print("|🧑🏻| Ingrese usuario Cliente: ");
                usuarioEscanner = entrada.next();
                System.out.print("|🗝| Ingrese contraseña: ");
                contraseniaEscaner = entrada.next();

                if (cliente.getNombreUsuario().equals(usuarioEscanner) && cliente.getContrasenia().equals
                        (contraseniaEscaner)) {
                    System.out.println("\n🎇 Sesion iniciada 🎇");
                } else {
                    System.out.println("\n❌ Usuario o contraseña incorrectos ❌");
                }
                break;

            default:
                break;
        }
    }
@Override
    public void recuperarContraseña(Cliente cliente, Administrador administrador) {
        int opcion2 = 0;
        //usuario.settDatos();
        System.out.println("Seleccione para recuperar contraseña: [1] Administrador [2] Cliente");
        opcion2 = entrada.nextInt();
        String nuevaContraseña;

        switch (opcion2) {
            case 1:
                System.out.println("Digite número de Cédula");
                registroId = entrada.nextInt();

                if (administrador.getIdAdministrador() == registroId) {
                    System.out.println("Digite la nueva contraseña");
                    nuevaContraseña = entrada.next();
                    administrador.setContraseniaAdministrador(nuevaContraseña);
                    System.out.println("La contraseña se ha actualizado");
                } else {
                    System.out.println("Usuario no encontrado");
                }
                break;

            case 2:
                System.out.println("Digite número de Cedula");
                registroId = entrada.nextInt();

                if (cliente.getId() == registroId) {
                    System.out.println("Digite la nueva Contraseña");
                    nuevaContraseña = entrada.next();
                    cliente.setContrasenia(nuevaContraseña);
                    System.out.println("La contraseña se ha actualizado");
                } else {
                    System.out.println("Usuario no encontrado");
                }
                break;
            default:
                break;
        }
    }
@Override
    public void cerrarCesion(){
        System.out.println("Proceso finalizado");
        System.exit(0);
    }

}
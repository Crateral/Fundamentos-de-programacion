package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Estado;
import com.ecommerce.store.beans.Rol;
import com.ecommerce.store.beans.Usuario;

import java.util.Scanner;

public class UsuarioRegistrar extends Usuarios {

    public void crearUsuario(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("| Registro                                |");
        System.out.println("===========================================");
        System.out.print("Ingrese la identificación: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese el usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(id, correo, usuario, password, Rol.USER, Estado.ACTIVO);
        System.out.println(nuevoUsuario.toString());
        agregarUsuario(nuevoUsuario);
    }

}

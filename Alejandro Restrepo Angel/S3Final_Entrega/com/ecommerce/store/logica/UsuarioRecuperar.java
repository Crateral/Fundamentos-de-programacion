package com.ecommerce.store.logica;

import java.util.Scanner;

public class UsuarioRecuperar extends Usuarios {

    public void restrablecerPassword() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("| Recuperar contraseña                    |");
        System.out.println("===========================================");
        System.out.print("Ingrese la identificación: ");
        String id = scanner.nextLine();
        recuperarPassword(id);
    }
}

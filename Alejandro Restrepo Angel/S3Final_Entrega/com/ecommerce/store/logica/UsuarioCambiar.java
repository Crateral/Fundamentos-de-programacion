package com.ecommerce.store.logica;

import com.ecommerce.store.interfaces.Vistas;

import java.util.Scanner;

public class UsuarioCambiar extends Usuarios implements Vistas {

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("| Cambiar contraseña                      |");
        System.out.println("===========================================");
        System.out.print("Ingrese la identificación: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();
        System.out.print("Ingrese la nueva contraseña: ");
        String nuevoPassword = scanner.nextLine();
        System.out.print("Ingrese la nueva contraseña: ");
        String nuevoPassword2 = scanner.nextLine();
        cambiarPassword(id, nuevoPassword);
    }
}

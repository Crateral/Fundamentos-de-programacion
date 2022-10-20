package com.ecommerce.store.logica;

import com.ecommerce.store.interfaces.Vistas;

import java.util.Scanner;

public class Login extends Usuarios implements Vistas {
    private String id, password;

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("| Iniciar sesión                          |");
        System.out.println("===========================================");
        System.out.print("Ingrese la identificación: ");
        id = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        password = scanner.nextLine();
        iniciarSesion(id, password);
    }
}

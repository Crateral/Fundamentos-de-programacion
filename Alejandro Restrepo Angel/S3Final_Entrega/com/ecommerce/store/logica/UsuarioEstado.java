package com.ecommerce.store.logica;

import com.ecommerce.store.interfaces.Vistas;

import java.util.Scanner;

public class UsuarioEstado extends Usuarios implements Vistas {

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("| Cambiar Estado Usuario                  |");
        System.out.println("===========================================");
        mostrarUsuarios();
        System.out.print("Ingrese la identificación: ");
        String id = scanner.nextLine();
        cambiarEstado(id);
    }
}

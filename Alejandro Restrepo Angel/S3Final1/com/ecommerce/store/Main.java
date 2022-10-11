package com.ecommerce.store;

import com.ecommerce.store.producto.ListaProductos;
import com.ecommerce.store.login.Login;
import com.ecommerce.store.usuario.Recuperar;
import com.ecommerce.store.usuario.Registrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            try{
                System.out.println("=========================");
                System.out.println("Ecommerce AR");
                System.out.println("=========================");
                System.out.println("1. Registrarse");
                System.out.println("2. Iniciar sesión ");
                System.out.println("3. ¿Olvidaste tu contraseña?");
                System.out.println("4. Lista de productos");
                System.out.println("5. Salir");
                System.out.print("Ingrese la opción: ");
                opcion = scanner.nextInt();
                menu(opcion);
            }
            catch (InputMismatchException excepcion)
            {
                System.out.println("Error! No es una opción válida \n");
                scanner.next();
                opcion = 0;
            }
        }
        while(opcion!=5);
        scanner.close();
    }

    public static void menu(int opcion){
        switch (opcion) {
            case 1:
                Registrar registro = new Registrar();
                registro.crearUsuario();
                break;
            case 2:
                Login inicio = new Login();
                inicio.iniciarSesion();
                break;
            case 3:
                Recuperar restablece = new Recuperar();
                restablece.nuevoPassword();
                break;
            case 4:
                ListaProductos lista = new ListaProductos();
                lista.mostrarProductos();
                break;
            case 5:
                System.out.println("Programa Finalizado\n");
                break;
            default:
                System.out.println("Error: " + opcion + " no es una opción válida.\n");
        }
    }
}

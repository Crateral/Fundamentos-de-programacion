package com.ecommerce.store.principal;

import com.ecommerce.store.logica.Login;
import com.ecommerce.store.logica.Productos;
import com.ecommerce.store.logica.UsuarioRecuperar;
import com.ecommerce.store.logica.UsuarioRegistrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static void menu(int opcion){
        switch (opcion) {
            case 1:
                UsuarioRegistrar registro = new UsuarioRegistrar();
                registro.crearUsuario();
                break;
            case 2:
                Login inicio = new Login();
                inicio.iniciarSesion();
                break;
            case 3:
                UsuarioRecuperar restablece = new UsuarioRecuperar();
                restablece.restrablecerPassword();
                break;
            case 4:
                Productos lista = new Productos();
                lista.mostrarProductos();
                break;
            case 5:
                System.out.println("Programa Finalizado\n");
                break;
            default:
                System.out.println("Error: " + opcion + " no es una opción válida.\n");
        }
    }

    //public static void main(String [] args){
    public void pantalla(){ //Eliminar luego
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            try{
                System.out.println("\n===========================================");
                System.out.println("Ecommerce AR");
                System.out.println("===========================================");
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
}

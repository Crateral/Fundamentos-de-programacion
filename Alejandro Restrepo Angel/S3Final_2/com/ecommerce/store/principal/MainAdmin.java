package com.ecommerce.store.principal;

import com.ecommerce.store.logica.Logout;
import com.ecommerce.store.logica.ProductoActualizar;
import com.ecommerce.store.logica.ProductoCrear;
import com.ecommerce.store.logica.ProductoEliminar;
import com.ecommerce.store.logica.Productos;
import com.ecommerce.store.logica.UsuarioCambiar;
import com.ecommerce.store.logica.Usuarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAdmin {

    private static void menu(int opcion){
        switch (opcion) {
            case 1:
                ProductoCrear nuevoProducto = new ProductoCrear();
                nuevoProducto.vistaPantalla();
                break;
            case 2:
                ProductoActualizar modificarProducto = new ProductoActualizar();
                modificarProducto.vistaPantalla();
                break;
            case 3:
                ProductoEliminar borrarProducto = new ProductoEliminar();
                borrarProducto.vistaPantalla();
                break;
            case 4:
                Productos listaProductos = new Productos();
                listaProductos.mostrarProductos();
                break;
            case 5:
                Usuarios listaUsuarios = new Usuarios();
                listaUsuarios.mostrarUsuarios();
                break;
            case 6:

                break;
            case 7:
                UsuarioCambiar modificarPassword = new UsuarioCambiar();
                modificarPassword.vistaPantalla();
                break;
            case 8:
                Logout salir = new Logout();
                salir.cerrarSesion();
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
                System.out.println("Ecommerce Administrador");
                System.out.println("===========================================");
                System.out.println("1. Agregar Producto");
                System.out.println("2. Modificar Producto ");
                System.out.println("3. Eliminar Producto");
                System.out.println("4. Lista de productos");
                System.out.println("===========================================");
                System.out.println("5. Lista de usuarios");
                System.out.println("6. Cambiar estado de usuario");
                System.out.println("===========================================");
                System.out.println("7. Cambiar contraseña");
                System.out.println("8. Cerrar sesión");
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
        while(opcion!=8);
    }
}

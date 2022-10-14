package com.ecommerce.store.principal;

import com.ecommerce.store.logica.CarritoCompra;
import com.ecommerce.store.logica.CarritoFactura;
import com.ecommerce.store.logica.Logout;
import com.ecommerce.store.logica.CarritoActualizar;
import com.ecommerce.store.logica.CarritoCrear;
import com.ecommerce.store.logica.CarritoEliminar;
import com.ecommerce.store.logica.Productos;
import com.ecommerce.store.logica.UsuarioCambiar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUser {

    private static void menu(int opcion){
        switch (opcion) {
            case 1:
                CarritoCrear agregarProducto = new CarritoCrear();
                agregarProducto.vistaPantalla();
                break;
            case 2:
                CarritoActualizar modificarProducto = new CarritoActualizar();
                modificarProducto.vistaPantalla();
                break;
            case 3:
                CarritoEliminar borrarProducto = new CarritoEliminar();
                borrarProducto.vistaPantalla();
                break;
            case 4:
                CarritoCompra carrito = new CarritoCompra();
                carrito.mostrarCarrito();
                break;
            case 5:
                CarritoCompra vaciar = new CarritoCompra();
                vaciar.limpiarCarrito();
                break;
            case 6:
                CarritoFactura factura = new CarritoFactura();
                factura.vistaPantalla();
                break;
            case 7:
                Productos lista = new Productos();
                lista.cargarProductos();
                lista.mostrarProductos();
                break;
            case 8:
                UsuarioCambiar modificarPassword = new UsuarioCambiar();
                modificarPassword.vistaPantalla();
                break;
            case 9:
                Logout salir = new Logout();
                salir.cerrarSesion();
                break;
            default:
                System.out.println("Error: " + opcion + " no es una opción válida.\n");
        }
    }

    public static void main(String [] args){
    //public void pantalla(){ //Eliminar luego
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            try{
                System.out.println("\n===========================================");
                System.out.println("Ecommerce Usuario");
                System.out.println("===========================================");
                System.out.println("1. Agregar producto al carrito");
                System.out.println("2. Modificar producto del carrito");
                System.out.println("3. Eliminar producto del carrito");
                System.out.println("4. Mostrar carrito");
                System.out.println("5. Vaciar carrito");
                System.out.println("6. Generar factura");
                System.out.println("===========================================");
                System.out.println("7. Lista de productos");
                System.out.println("===========================================");
                System.out.println("8. Cambiar contraseña");
                System.out.println("9. Cerrar sesión");
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
        while(opcion!=9);
    }
}

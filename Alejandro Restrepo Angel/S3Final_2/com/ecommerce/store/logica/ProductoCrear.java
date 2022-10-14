package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Producto;
import com.ecommerce.store.interfaces.Vistas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductoCrear extends Productos implements Vistas {

    // Atributos de la clase
    private int codigo, idCategoria, precio, posicion;
    private String nombre, observacion;

    // Método para crear un producto
    private void crearProducto(int codigo, String nombre, int idCategoria, String observacion,int  precio) {
        Producto nuevoProducto = new Producto(codigo, nombre, idCategoria, observacion, precio);
        System.out.println(nuevoProducto.toString());
        if(agregarProducto(nuevoProducto)){
            System.out.println("Se ha agregado correctamente");
        }
        else{
            System.out.println("Ha ocurrido un error, intentalo nuevamente");
        }
    }

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n===========================================");
            System.out.println("Nuevo Producto");
            System.out.println("===========================================");
            System.out.print("Ingrese el código: ");
            codigo = scanner.nextInt();
            posicion = buscarProducto(codigo);
            if(posicion==-1) {
                System.out.print("Ingrese la catogoría: ");
                idCategoria = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nombre: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese Observaciones: ");
                observacion = scanner.nextLine();
                System.out.print("Ingrese el precio: ");
                precio = scanner.nextInt();
                crearProducto(codigo, nombre, idCategoria, observacion, precio);
            }
            else{
                System.out.println("Error, el producto ya se encuentra creado");
                mostrarProductos(posicion);
            }
        }
        catch (InputMismatchException excepcion){
            System.out.println("Error! No es una opción válida \n");
            scanner.next();
            codigo=0; nombre=""; idCategoria=0; observacion=""; precio=0;
        }
    }
}

package com.ecommerce.store.logica;

import com.ecommerce.store.interfaces.Vistas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarritoEliminar extends CarritoCompra implements Vistas {

    // Atributos de la clase
    private int codigo, posicion;

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n===========================================");
            System.out.println("Eliminar Producto del carrito");
            System.out.println("===========================================");
            System.out.print("Ingrese el código del producto: ");
            codigo = scanner.nextInt();
            posicion = buscarProducto(codigo);
            if(posicion==-1) {
                System.out.println("No se encontró el producto con código [" + codigo + "]");
            }
            else {
                if(eliminarCarrito(posicion)){
                    System.out.println("Se ha eliminado correctamente");
                }
                else{
                    System.out.println("Ha ocurrido un error, intentalo nuevamente");
                }
            }
        }
        catch (InputMismatchException excepcion){
            System.out.println("Error! No es una opción válida \n");
            scanner.next();
            codigo = 0;
        }
    }
}

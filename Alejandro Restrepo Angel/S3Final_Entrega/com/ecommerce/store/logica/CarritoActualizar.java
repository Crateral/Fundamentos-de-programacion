package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Compra;
import com.ecommerce.store.interfaces.Vistas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarritoActualizar extends CarritoCompra implements Vistas {

    // Atributos de la clase
    private int codigo, posicion, cantidad;

    // Método para actualizar un producto en el carrito
    private void actualizarCarrito(int posicion, int codigo,int cantidad) {
        Compra compra = retornaCompra(posicion);
        compra.setCantidad(cantidad);
        compra.setSubtotal((compra.getProducto().getPrecio()) * cantidad);
        System.out.println(compra.toString());
        agregarCarrito(posicion, compra);
    }

    // Método para la captura de datos
    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n===========================================");
            System.out.println("| Modificar Producto del carrito          |");
            System.out.println("===========================================");
            System.out.print("Ingrese el código del producto: ");
            codigo = scanner.nextInt();
            posicion = buscarProducto(codigo);
            if (posicion != -1) {
                System.out.println("===========================================");
                mostrarProductos(posicion);
                System.out.println("===========================================");
                System.out.print("Ingrese la cantidad: ");
                cantidad = scanner.nextInt();
                actualizarCarrito(posicion, codigo, cantidad);
            } else {
                System.out.println("No se encontró el producto con código [" + codigo + "]");
            }
        }
        catch (InputMismatchException excepcion){
            System.out.println("Error! No es una opción válida \n");
            scanner.next();
            codigo=0; cantidad=0;
        }
    }
}

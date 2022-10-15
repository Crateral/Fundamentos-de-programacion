package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Compra;
import com.ecommerce.store.beans.Producto;
import com.ecommerce.store.interfaces.Vistas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarritoCrear extends CarritoCompra implements Vistas {

    // Atributos de la clase
    private int codigo, posicion, indice, cantidad;
    private Producto producto;
    private double subtotal;

    // Método para agregar una compra al carrito
    private void agregarCarrito(int posicion, int cantidad){
        producto = retornaProducto(posicion);
        subtotal = producto.getPrecio() * cantidad;
        Compra compra = new Compra(producto, cantidad, subtotal);
        System.out.println(compra.toString());
        if(agregarCarrito(compra)){
            System.out.println("Se ha agregado correctamente");
        }
        else{
            System.out.println("Ha ocurrido un error, intentalo nuevamente");
        }
    }

    // Método para la captura de datos
    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n===========================================");
            System.out.println("| Agregar Producto al carrito             |");
            System.out.println("===========================================");
            System.out.print("Ingrese el código: ");
            codigo = scanner.nextInt();
            posicion = buscarProducto(codigo);
            if(posicion==-1) {
                System.out.println("No se encontró el producto con código [" + codigo + "]");
            }
            else{
                indice = buscarCarrito(codigo);
                if(indice==-1) {
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = scanner.nextInt();
                    agregarCarrito(posicion, cantidad);
                }
                else {
                    System.out.println("El producto con código [" + codigo + "] ya se encuentra en el carrito");
                }
            }
        }
        catch (InputMismatchException excepcion){
            System.out.println("Error! No es una opción válida \n");
            scanner.next();
            codigo=0;
        }
    }
}

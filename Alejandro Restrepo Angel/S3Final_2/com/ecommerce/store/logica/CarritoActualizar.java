package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Compra;
import com.ecommerce.store.interfaces.Vistas;

import java.util.Scanner;

public class CarritoActualizar extends CarritoCompra implements Vistas {

    private int codigo, posicion, cantidad;
    private double subtotal;

    private void actualizarCarrito(int posicion, int codigo,int cantidad) {
        Compra compra = retornaCompra(posicion);
        compra.setCantidad(cantidad);
        compra.setSubtotal((compra.getProducto().getPrecio()) * cantidad);
        System.out.println(compra.toString());
        agregarCarrito(posicion, compra);
    }

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("Modificar Producto del carrito");
        System.out.println("===========================================");
        System.out.print("Ingrese el código del producto: ");
        codigo = scanner.nextInt();
        posicion = buscarProducto(codigo);
        if(posicion!=-1) {
            System.out.println("===========================================");
            mostrarProductos(posicion);
            System.out.println("===========================================");
            System.out.print("Ingrese la cantidad: ");
            cantidad = scanner.nextInt();
            actualizarCarrito(posicion, codigo, cantidad);
        }
        else{
            System.out.println("No se encontró el producto con código [" + codigo + "]");
        }
    }
}

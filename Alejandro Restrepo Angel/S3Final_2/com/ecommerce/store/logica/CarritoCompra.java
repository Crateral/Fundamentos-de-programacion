package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Compra;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra extends Productos {

    //Lista de productos en el carrito
    private static List<Compra> carrito = new ArrayList<>();

    //Atributos de la Clase
    private int posicion;
    private boolean bandera;
    private double neto;

    // Método para ingresar una compra al carrito
    boolean agregarCarrito(Compra compra) {
        bandera = false;
        if(carrito.add(compra)){
            bandera = true;
        }
        return bandera;
    }

    // Método para ingresar un producto al arreglo en una posición determinada
    void agregarCarrito(int posicion, Compra compra) {
        carrito.set(posicion, compra);
    }

    // Método para retornar un objeto del carrito
    Compra retornaCompra(int posicion){
        return carrito.get(posicion);
    }

    // Método para vaciar al carrito
    public void limpiarCarrito() {
        carrito.clear();
        System.out.println("Se han eliminado los productos del carrito! \n");
    }

    // Método para eliminar un producto por medio de su posición
    boolean eliminarCarrito(int posicion){
        bandera = false;
        if(carrito.remove(carrito.get(posicion))){
            bandera = true;
        }
        return bandera;
    }

    // Método para calcular la sumatoria de los subtotales
    double calcularNeto() {
        neto = 0;
        for (int i = 0; i < carrito.size(); i++) {
            neto = neto + carrito.get(i).getSubtotal();
        }
        return neto;
    }

    // Método para imprimir el carrito en pantalla
    public void mostrarCarrito() {
        if(!carrito.isEmpty()) {
            // Recorrer la lista
            for (Compra compra : carrito) {
                System.out.println(compra.toString());
            }
        }
        else{
            System.out.println("No hay productos agregados! \n");
        }
    }

    // Método para imprimir un producto de una posición pasada del carrito
    public void mostrarCarrito(int posicion) {
        System.out.println(carrito.get(posicion).toString());
    }
}

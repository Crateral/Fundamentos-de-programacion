package com.co.nttdata.ecommerce.logica;

import java.util.ArrayList;
import java.util.List;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Producto;
import com.co.nttdata.ecommerce.interfaces.GestionCarritoDeCompra;

public class GestionCarritoDeComprasImp implements GestionCarritoDeCompra {

    @Override
    public CarritoDeCompras agregarAlCarrito(CarritoDeCompras cdc, List<Producto> p) {

        System.out.println("Agregando productos al carrito Aguarde ...");
        System.out.println("");
        System.out.println(" - Productos agregados al carrito 🛒: ");
        cdc.getProductos().forEach((pe) -> System.out.println(pe.toString()));
        System.out.println();
        cdc.setProductos(p);
        return cdc;
    }

    @Override
    public CarritoDeCompras calcularTotalConIva(CarritoDeCompras cdc) {
        double total = 0.0, subtotal = 0.0, totalproducto = 0.0, subtotalUni = 0.0;

        for (int i = 0; i < cdc.getProductos().size(); i++) {
            //1100           2000
            subtotal = subtotal + cdc.getProductos().get(i).getPrecio() * cdc.getProductos().get(i).getIva();
            subtotalUni = cdc.getProductos().get(i).getPrecio() * cdc.getProductos().get(i).getIva();
            totalproducto = totalproducto + cdc.getProductos().get(i).getPrecio();
            total = total + cdc.getProductos().get(i).getPrecio() +
                    (cdc.getProductos().get(i).getPrecio() *
                            cdc.getProductos().get(i).getIva());
            System.out.println("Producto: " + cdc.getProductos().get(i).getNombre() + " Precio Producto: "
                    + cdc.getProductos().get(i).getPrecio() + " Valor iva: "
                    + subtotalUni);
        }
        cdc.setSubTotaSinIva(totalproducto);
        cdc.setValorTotalIva(subtotal);
        cdc.setSubTotalConIva(total);
        return cdc;
    }

    @Override
    public CarritoDeCompras calcularCostoEnvio(CarritoDeCompras cc, Cliente nuevoCliente) {
        double valorEnvio = 0.0;
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Bucaramanga");
        ciudades.add("Bogota");
        ciudades.add("Medellin");
        ciudades.add("Cartagena");
        ciudades.add("Aguachica");


        for (String ciudade : ciudades) {

            if (nuevoCliente.getCiudad().equals(ciudade)) {

                System.out.println("la Ciudad en la que te encuentras es: " + nuevoCliente.getCiudad() +
                        " y es una ciudad principal");
                System.out.println("Calculando costo de envio...");
                valorEnvio = cc.getValorTotalIva() * 0.05;
                System.out.println("El precio de envio para tu compra de: " + cc.getSubTotalConIva() +
                        " tiene un descuento del 5%, pagas: " + valorEnvio + " por envio.");
                break;
            } else {
                valorEnvio = cc.getSubTotalConIva() * 0.10;

                System.out.println("No te encuentras en una ciudad principal el precio de envio para tu compra de: " +
                        cc.getSubTotalConIva() + " tiene un descuento del 10%, pagas: " + valorEnvio);


            }
        }
        cc.setValorEnvio(valorEnvio);
        return cc;
    }
}



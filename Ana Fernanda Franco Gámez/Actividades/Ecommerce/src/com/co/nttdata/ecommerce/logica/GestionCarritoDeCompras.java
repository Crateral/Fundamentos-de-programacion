package com.co.nttdata.ecommerce.logica;

import java.util.ArrayList;
import java.util.List;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Producto;

public class GestionCarritoDeCompras {
    public CarritoDeCompras añadirAlCarrito(CarritoDeCompras cdc, List<Producto> p) {
        System.out.println("Agregando productos al carrito Aguarde ...");
        System.out.println("");
        System.out.println(" - Productos agregados al carrito 🛒: ");
        cdc.getProductos().forEach((pe) -> System.out.println(pe.toString()));
        //cdc.getProductos().forEach((pe) -> System.out.println(pe.getNombre() + " -> Categoria  " +pe.getCategoria().getNombre() + " - > " + pe.getMarca().getDescripcion()));

        System.out.println();
        cdc.setProductos(p);
        return cdc;

    }

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

    public CarritoDeCompras calcularCostoEnvio(CarritoDeCompras cc, Cliente nuevoCliente) {

        double valorEnvio = 0.0;
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Bucaramanga");
        ciudades.add("Bogota");
        ciudades.add("Medellin");
        ciudades.add("Cartagena");
        ciudades.add("Aguachica");


        for (int i = 0; i < ciudades.size(); i++) {

            if (nuevoCliente.getCiudad().equals(ciudades.get(i))) {

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

                //Para el calculo del envio se debe tener en cuenta la ubicacion del cliente
                //Si se encuentra en ciudades principales se debe cobrar el 5%
                //Si se encuentra en ciudades no principales se debe cobrar el 10%

            }
        }
        cc.setValorEnvio(valorEnvio);
        return cc;
    }


}

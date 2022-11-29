package com.co.nttdata.ecommerce.logica;

import java.util.ArrayList;
import java.util.List;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Producto;

public class GestionCarritoDeCompras {




    public CarritoDeCompras añadirAlCarrito(CarritoDeCompras cdc, List<Producto> p) {

        cdc.setProductos(p);
        return cdc;
    }
    public CarritoDeCompras calcularTotalConIva(CarritoDeCompras cdc) {

        double total = 0.0;

        for (int i = 0; i < cdc.getProductos().size(); i++) {
            //1100           2000
            total = total + cdc.getProductos().get(i).getPrecio() +//precio del producto
                    (cdc.getProductos().get(i).getPrecio() *
                            cdc.getProductos().get(i).getIva());

        }

        cdc.setSubTotalConIva(total);
        return cdc;

    }

    public double calcularCostoEnvio(CarritoDeCompras cdc, Cliente usuario1,GestionCarritoDeCompras gcdc) {
        List<String>ciudades=new ArrayList<>();


        double valorEnvioPrincipal=0;
        double valorEnvioNoPrincipal= 0;

        ciudades.add("Bogota");
        ciudades.add("Cali");
        ciudades.add("Medellin");
        ciudades.add("Santa Martha");

        for(int i=0; i < ciudades.size();i++){

            if (usuario1.getCiudad().equals(ciudades.get(i))){

                valorEnvioPrincipal=cdc.getSubTotalConIva()*0.05;

        break;
            }
            else {

                valorEnvioNoPrincipal=cdc.getSubTotalConIva()*0.10;
            break;
            }
        }

        gcdc.calcularTotalConIva(cdc);


        return valorEnvioPrincipal;
    }

}

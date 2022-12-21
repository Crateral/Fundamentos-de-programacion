package com.co.nttdata.ecommerce.interfaces;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Producto;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;

import java.util.List;

public interface IGestionCarritoDeCompras {

    public CarritoDeCompras añadirAlCarrito(CarritoDeCompras cdc, List<Producto> p);
    public CarritoDeCompras calcularTotalConIva(CarritoDeCompras cdc);
    public double calcularCostoEnvio(CarritoDeCompras cdc, Cliente usuario1, GestionCarritoDeCompras gcdc);
}

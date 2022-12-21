package com.co.nttdata.ecommerce.interfaces;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Producto;

import java.util.List;

public interface GestionCarritoDeCompra {
    public CarritoDeCompras agregarAlCarrito(CarritoDeCompras cdc, List<Producto> p);

    public CarritoDeCompras calcularTotalConIva(CarritoDeCompras cdc);

    public CarritoDeCompras calcularCostoEnvio(CarritoDeCompras cc, Cliente nuevoCliente);
}

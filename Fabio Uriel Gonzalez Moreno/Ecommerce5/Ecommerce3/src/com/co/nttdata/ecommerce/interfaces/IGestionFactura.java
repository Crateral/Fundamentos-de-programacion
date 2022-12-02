package com.co.nttdata.ecommerce.interfaces;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Empresa;
import com.co.nttdata.ecommerce.entidades.Factura;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;

public interface IGestionFactura {
    public Factura pagar(Cliente usuario1, CarritoDeCompras cdc,GestionCarritoDeCompras gcdc);
    public void imprimirFactura(CarritoDeCompras cdc, GestionCarritoDeCompras gcdc, Empresa ecommerce,Cliente cliente);

}

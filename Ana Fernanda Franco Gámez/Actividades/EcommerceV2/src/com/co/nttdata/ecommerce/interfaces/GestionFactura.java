package com.co.nttdata.ecommerce.interfaces;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Empresa;
import com.co.nttdata.ecommerce.entidades.Factura;

public interface GestionFactura {
    public Factura pagar(Cliente cliente, CarritoDeCompras cc, Empresa datosEmpresa);

    public void imprimirFactura(Cliente c1);
}

package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Empresa;
import com.co.nttdata.ecommerce.entidades.Factura;
import com.co.nttdata.ecommerce.interfaces.IGestionFactura;

public class GestionFactura implements IGestionFactura {
    Factura f = new Factura();
@Override
    public Factura pagar(Cliente usuario1, CarritoDeCompras cdc,GestionCarritoDeCompras gcdc) {



        f.setCliente(usuario1);
        f.setDescripcion("Mi primera factura");
        f.setIdFactura(123123);
        f.setProductos(cdc);
        f.setCliente(usuario1);
        f.setValorTotalConIva(cdc.getSubTotalConIva() + cdc.getValorEnvio());
        f.setValorDeEnvio(gcdc.calcularCostoEnvio(cdc,usuario1,gcdc));


        return f;


    }
  @Override
    public void imprimirFactura(CarritoDeCompras cdc, GestionCarritoDeCompras gcdc, Empresa ecommerce,Cliente cliente){

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.format("%50s","NUMERO FACTURA: "+ f.getIdFactura());
        System.out.println();
        System.out.format("DATOS DEL CLIENTE: ");
        System.out.println();
        System.out.println("Nombre: "+f.getCliente().getNombreUsuario()+ "\n"+"Correo: "+f.getCliente().getCorreo()+
                "\n"+"Ciudad: "+f.getCliente().getCiudad()+ "\n"+"Direccion: "+f.getCliente().getDireccion()+ "\n"+"Telefono: "+f.getCliente().getTelefono());
        System.out.println("\n");

        System.out.println("PRODUCTOS: ");

        f.getProductos(cdc);

        System.out.println("\n");
        System.out.println("VAlOR TOTAL CON IVA: " + f.getValorTotalConIva() );
        System.out.println("VAlOR ENVIO: " + f.getValorDeEnvio() );
        System.out.println("TOTAL A PAGAR: " +(f.getValorTotalConIva()+f.getValorDeEnvio()) );
    }



}

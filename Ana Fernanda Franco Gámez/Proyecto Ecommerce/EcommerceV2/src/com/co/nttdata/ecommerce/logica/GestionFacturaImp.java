package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.interfaces.GestionFactura;


public class GestionFacturaImp implements GestionFactura {
    Factura f = new Factura();

    @Override
    public Factura pagar(Cliente cliente, CarritoDeCompras cc, Empresa datosEmpresa) {

        f.setCliente(cliente);
        f.setIdFactura(123123);
        // f.setFecha(26/02/2022);
        f.setEmpresa(datosEmpresa);
        f.setCliente(cliente);
        f.setDescripcion("Mi primera factura");
        f.setProductos(cc);
        f.setValorTotalConIva(cc.getSubTotalConIva() + cc.getValorEnvio());
        return f;
    }

    @Override
    public void imprimirFactura(Cliente c1) {
        //    f.getProductos().getProductos().forEach(producto -> System.out.println(producto.toString()));
        System.out.println("Se esta generando tu factura aguarde....");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.format("%52s", "Factura N°. " + f.getIdFactura());
        System.out.println();
        System.out.println("----------------------------------------------------- ");
        System.out.println("       Factura Electronica Empresa " + f.getEmpresa().getNombreEmpresa());

        System.out.format("%52s", "NIT Empresa: " + f.getEmpresa().getNitEmpresa());
        System.out.println();
        System.out.format("%52s", "Logo: " + f.getEmpresa().getLogo());
        System.out.println();
        System.out.format("%52s", "Direccion: " + f.getEmpresa().getDireccion());
        System.out.println();
        System.out.format("%52s", "Telefono: " + f.getEmpresa().getTelefono());
        System.out.println();

        System.out.println("-----------------------------------------------------");
        System.out.println("Datos Cliente ");
        System.out.println("Nombre: " + f.getCliente().getNombreUsuario() + "  Tipo Documento:" +
                f.getCliente().getTipoIdentificacion() + "   Numero: " + f.getCliente().getNumeroIdentificacion());
        System.out.println("Telefono: " + f.getCliente().getTelefono() + "     Direccion: " + f.getCliente().getDireccion());
        System.out.println("Ciudad:" + f.getCliente().getCiudad() + "  Forma de pago: " + f.getCliente().getMetodoDePago());
        System.out.println("-----------------------------------------------------");
        System.out.println("ID          Nombre          Cantidad       Precio  ");

        for (Producto p : f.getProductos().getProductos()) {

            System.out.format("%5s %12s %12s %18s", p.getIdProducto(), p.getNombre(), p.getCantidadDiponible(), p.getPrecio());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
        System.out.format("%50s", "Total Productos: " + f.getProductos().getSubTotaSinIva());
        System.out.println();
        System.out.format("%50s", "Valor Iva: " + f.getProductos().getValorTotalIva());
        System.out.println();
        System.out.format("%50s", "Total Pedido: " + f.getProductos().getSubTotalConIva());
        System.out.println();
        System.out.format("%49s", "Costo envio: " + f.getProductos().getValorEnvio());
        System.out.println();
        System.out.printf("%50s", "Total a Pagar: " + f.getValorTotalConIva());
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("Descripcion: " + f.getDescripcion());
        System.out.println("-----------------------------------------------------");
        // f.getProductos();

    }
}

package com.co.nttdata.ecommerce.utill.Factura;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FacturaUtill {
    Factura f = new Factura();


       public void escribirArchivo(String nombreArchivo, CarritoDeCompras cdc, GestionCarritoDeCompras gcdc, Empresa ecommerce, Cliente cliente) {
           f.setIdFactura(123123);
           f.setDescripcion("Factura 001");
           f.setValorTotalConIva(cdc.getSubTotalConIva()+ cdc.getValorEnvio());
        FileWriter archivo = null;
        try {
            archivo = new FileWriter("C:\\Users\\Fabio Gonzalez\\Documents\\NTTDATA\\" + nombreArchivo, true);
            archivo.write("                                       Factura N°. "+f.getIdFactura() + "\n" +
                              "*********************************************************"+"\n" +
                              "                   EMPRESA: "+ ecommerce.getNombreEmpresa()+"\n" +
                              "*********************************************************"+"\n" +
                              "                               NIT: " + ecommerce.getNit()+"\n" +
                              "                               DIRECCION: " + ecommerce.getDireccion()+ "\n" +
                              "                               TELEFONO:  " + ecommerce.getTelefono() + "\n" +
                              "*********************************************************"+"\n" +
                              "DATOS DEL CLIENTE:                                       "+"\n" +
                              "*********************************************************"+"\n" +
                              "Nombre Cliente: " + cliente.getNombreUsuario()+"\n" +
                              "Correo: "+ cliente.getCorreo()+"\n" +
                              "Ciudad: "+ cliente.getCiudad()+"\n" +
                              "Direccion: "+ cliente.getDireccion()+"\n" +
                              "Telefono: "+ cliente.getTelefono()+"\n" +
                              "*********************************************************"+"\n" +
                              "PRODUCTOS:                                               "+"\n" +
                              "*********************************************************"+"\n" +
                              "*********************************************************"+"\n" +
                              "ID                NOMBRE                           PRECIO"+"\n" );

            for (Producto p:cdc.getProductos()
                 ) {
                //System.out.println(p.getIdProducto());
                archivo.write(p.getIdProducto()+"                 "+p.getNombre()+"                "+p.getPrecio()+    "\n");

            }

            archivo.write("*********************************************************"+"\n" +
                    "                        Valor Total con IVA:       " + f.getValorTotalConIva()+"\n" +
                    "                            Valor Envio:           " + gcdc.calcularCostoEnvio(cdc, cliente, gcdc)+ "\n" +
                    "                            Total a Pagar:         " + (f.getValorTotalConIva()+gcdc.calcularCostoEnvio(cdc, cliente, gcdc))+"\n" );



            System.out.println("El archivo se ha escrito con exito");
            archivo.close();
        } catch (Exception var4) {
            System.out.println("Error al escribir el archivo: " + var4.getMessage());
        }

    }

    public  void leerArchivo(String nombreArchivo,CarritoDeCompras cdc, GestionCarritoDeCompras gcdc, Empresa ecommerce,Cliente cliente) {
        File archivo = new File("C:\\Users\\Fabio Gonzalez\\Documents\\NTTDATA\\" + nombreArchivo);
        Scanner s = null;

        try {
            s = new Scanner(archivo);

            while(s.hasNextLine()) {
                String linea = s.nextLine();
                System.out.println(linea);
            }
        } catch (Exception var12) {
            System.out.println("Error al leer el archivo: " + var12.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception var11) {
                System.out.println("Error al cerrar la lectura del archivo: " + var11.getMessage());
            }

        }

    }

}

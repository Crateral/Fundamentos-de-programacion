package com.co.nttdata.ecommerce.utill.Factura;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
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
                    "                            Total a Pagar:         " + (f.getValorTotalConIva()+
                                                                    gcdc.calcularCostoEnvio(cdc, cliente, gcdc))+"\n" );



            System.out.println("El archivo se ha escrito con exito");
            archivo.close();
        } catch (Exception var4) {
            System.out.println("Error al escribir el archivo: " + var4.getMessage());
        }

    }

    public  void leerArchivo(String nombreArchivo,CarritoDeCompras cdc, GestionCarritoDeCompras gcdc, Empresa ecommerce,Cliente cliente) {
        File archivo = new File("C:\\Users\\Fabio Gonzalez\\Documents\\NTTDATA\\" + nombreArchivo);
        Scanner entrada = null;

        try {
            entrada = new Scanner(archivo);

            while(entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                System.out.println(linea);
            }
        } catch (Exception var12) {
            System.out.println("Error al leer el archivo: " + var12.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (Exception var11) {
                System.out.println("Error al cerrar la lectura del archivo: " + var11.getMessage());
            }

        }

    }
    public void cargarlista(String nombreArchivo) throws FileNotFoundException {

        String Texto;
        // Pongo un path de ejemplo, en el pathname debes poner el que deseas usar
        Scanner Filast = new Scanner(new File("C:\\Users\\Fabio Gonzalez\\Documents\\NTTDATA\\" + nombreArchivo)).useDelimiter(",\\s*");
        // Puedes usar LinkedList, pero de normal se usa ArrayList
        List<String> milista = new ArrayList<String>();


        while (Filast.hasNext()) {
            // Va linea por linea
            Texto = Filast.next();
            milista.add(Texto);
        }

        Filast.close();
        String[] Textarray = milista.toArray(new String[0]);


        /*for (String s : Textarray) {
            System.out.println(s);
        }*/
        for (int i =0; i<milista.size();i++){
            System.out.println(milista.get(i));

        }


    }
    public List<Producto> agregarProductos(String nombreArchivo) {
        File archivo = new File("C:\\Users\\Fabio Gonzalez\\Documents\\NTTDATA\\" + nombreArchivo);
        Scanner s = null;

        ArrayList<Producto> listaProductos = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        Producto producto = new Producto();
        CarritoDeCompras carritoDeCompras = new CarritoDeCompras();
        GestionCarritoDeCompras gestionCarritoDeCompras = new GestionCarritoDeCompras();

        try {
            s = new Scanner(archivo);

            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] parts = linea.split("\\|");
                String p1 = parts[0];
                String p2 = parts[1];
                String p3 = parts[2];
                String p4 = parts[3];
                String p5 = parts[4];
                String p6 = parts[5];
                String p7 = parts[6];
                String p8 = parts[7];
                String p9 = parts[8];
                String p10 = parts[9];

                lista2.add(p1);
                lista2.add(p2);
                lista2.add(p3);
                lista2.add(p4);
                lista2.add(p5);
                lista2.add(p6);
                lista2.add(p7);
                lista2.add(p8);
                lista2.add(p9);
                lista2.add(p10 + "\n");


                producto.setIdProducto(Integer.parseInt(p1));
                producto.setNombre((p2));
                producto.setCantidadDiponible(Integer.parseInt(p3));
                producto.setPrecio(Double.parseDouble(p4));
                producto.setDescuento(Boolean.parseBoolean(p5));
                producto.setIva(Double.parseDouble((p6)));
                producto.setDescripcion((p7));
                producto.setImg(p8);
                producto.setMarca(Marca.valueOf(p9));
                producto.setCategoria(Categoria.valueOf(p10));

                listaProductos.add(producto);

                carritoDeCompras.setProductos(listaProductos);//crea objeto carrito de compras
                //cdc.setProductos(pi.dividirDatosProducto(prueba));

                carritoDeCompras.setProductos(listaProductos);

                carritoDeCompras = gestionCarritoDeCompras.añadirAlCarrito(carritoDeCompras, listaProductos);
                carritoDeCompras = gestionCarritoDeCompras.calcularTotalConIva(carritoDeCompras);

                 /*  for (String parte : parts) {
                 System.out.print(parte);
                 }*/
            }
        } catch (Exception var13) {
            System.out.println("Error al leer el archivo: " + var13.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception var12) {
                System.out.println("Error al cerrar la lectura del archivo: " + var12.getMessage());
            }

        }
        for (String a : lista2) {
            System.out.print(a);
        }

        return listaProductos;
    }
}
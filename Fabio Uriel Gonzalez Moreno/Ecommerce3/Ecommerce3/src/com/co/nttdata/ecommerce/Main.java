package com.co.nttdata.ecommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;
import com.co.nttdata.ecommerce.logica.GestionFactura;



public class Main extends GestionCarritoDeCompras {
    List<Producto>listaProductos;

    public static void main(String[] args) {

        List<Producto>listaProductos=new ArrayList<>();

        String usu, con, conNueva;

        Producto Televisor=new Producto(001,"TV",50,250000,
                true,0.19,"full hd","jpa",Marca.SAMSUNG,Categoria.ELETRODOMESTICOS);

        Producto Lavadora=new Producto(002,"Lavadora Secadora",20,580000,
                true,0.19,"full hd","jpa",Marca.SAMSUNG,Categoria.ELETRODOMESTICOS);

        Producto SuperMan=new Producto(003,"Super MAn",200,75000,
                true,0.19," Liga De la Justicia","jpa",Marca.MATTEL,Categoria.JUGUETERIA);

        Producto Balon=new Producto(004,"Balon Futbol",30,95000,
                true,0.19," Balon semi pro-fecional","jpa",Marca.GOLTY,Categoria.DEPORTES);

        Producto Balon1=new Producto(005,"Balon Basket Ball",10,85000,
                true,0.19," Balon principiantes","jpa",Marca.GOLTY,Categoria.DEPORTES);

        Producto Batman=new Producto(006,"Caballero de la noche",10,105000,
                true,0.19," Liga de la justicia","jpa",Marca.MATTEL,Categoria.JUGUETERIA);

        Producto Horno=new Producto(007,"Horno Tostador",5,700000,
                true,0.19," Horno Tostador pequeño ","jpa",Marca.ASUS,Categoria.ELETRODOMESTICOS);

        Producto Laptop=new Producto(8,"Partatil 15",15,1550000,
                true,0.19," Portatil Negro 15' ","jpa1",Marca.ASUS,Categoria.TECNOLOGIA);

        Producto Bicicleta=new Producto(9,"Todo terreno",15,350000,
                true,0.19," Portatil Negro 15' ","jpa1",Marca.GOLTY,Categoria.DEPORTES);

        Producto Camiza=new Producto(0010,"Polo",10,40000,
                true,0.19," Portatil Negro 15' ","jpa1",Marca.OFFCORSS,Categoria.ROPA);


        // se agregan productos





        CarritoDeCompras cdc= new CarritoDeCompras();// se crea objeto carrito de compras

        GestionCarritoDeCompras gcdc =new GestionCarritoDeCompras();//se crea objeto de carrito de compras

        Cliente usuario1=new Cliente(2126,"fabio","fabio@gmail.com","3251871369","carrera 52#253-62",
                true,"526639","CC","Efectivo","Bogota");
        Cliente cliente=new Cliente();


        Empresa Ecommerce=new Empresa("258933-6","Ecommerce","Calle 25 # 36-85",3632290);

        Usuario prueba=new Usuario();
        Scanner entrada= new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("1. Registro ");
            System.out.println("2. Iniciar sesión ");
            System.out.println("3. Agregar productos Al carrito");
            System.out.println("4. Calcular costo de envio ");
            System.out.println("5. Generar factura");
            System.out.println("6. Salir");
            System.out.println("-------------------------------");
            System.out.println("-  ingresa la opcion");
            System.out.println("-------------------------------");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:

                    usuario1.registro(usuario1,cliente);

                    break;
                case 2:

                    usuario1.inicioSesion(usuario1,cliente);




                    break;
                case 3:

                    //Se agregan 6 productos al carrito
                    listaProductos.add(Televisor);
                    listaProductos.add(Lavadora);
                    listaProductos.add(SuperMan);
                    listaProductos.add(Balon);
                    listaProductos.add(Balon1);
                    listaProductos.add(Batman);

                    cdc.setProductos(listaProductos);//crea objeto carrito de compras
                    cdc=gcdc.añadirAlCarrito(cdc,listaProductos);


                    //cc.setProductos(listaProductos);
                    //cc = gc.añadirAlCarrito(cc, listaProductos);
                    System.out.println("  Calculando iva de productos ");
                    cdc=gcdc.calcularTotalConIva(cdc);
                    //cc = gc.calcularTotalConIva(cc);


                    break;
                case 4:
                    gcdc.calcularCostoEnvio(cdc,usuario1,gcdc);



                case 5:
                    GestionFactura fac01= new GestionFactura();
                    fac01.pagar(usuario1,cdc,gcdc);
                    fac01.imprimirFactura(usuario1,cdc,gcdc,Ecommerce,cliente);

                    break;
                case 6:
                    System.out.println("vuelva pronto ");
                    System.exit(0);
                    break;

            }


        }
        while (opcion < 7);
        System.out.println("Opcion no valida");


        //cdc.getProductos().forEach(producto -> System.out.println(producto.getNombre()));

        //System.out.println("Total a pagar: "+cdc.getSubTotalConIva());

        }


       // TODO Auto-generated method stub

        //Crear 10 prodcutos
        //Añadir 6 al carrito de comprar
        //Crear la factura de ese carrito de compras

    }


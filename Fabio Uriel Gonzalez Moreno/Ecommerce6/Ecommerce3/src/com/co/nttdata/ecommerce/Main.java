package com.co.nttdata.ecommerce;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;
import com.co.nttdata.ecommerce.logica.GestionFactura;
import com.co.nttdata.ecommerce.logica.GestionLogin;
import com.co.nttdata.ecommerce.utill.Factura.FacturaUtill;


public class Main extends GestionCarritoDeCompras {

    public static void main(String[] args) throws FileNotFoundException {

        List<Producto> listaProductos = new ArrayList<>();
        FacturaUtill facturaUtil = new FacturaUtill();

        String usu, con, conNueva;

        Producto Televisor = new Producto(1, "TV               ", 50, 250000,
                true, 0.19, "full hd", "jpa", Marca.SAMSUNG, Categoria.ELETRODOMESTICOS);

        Producto Lavadora = new Producto(2, "Lavadora Secadora", 20, 580000,
                true, 0.19, "full hd", "jpa", Marca.SAMSUNG, Categoria.ELETRODOMESTICOS);

        Producto SuperMan = new Producto(3, "Super MAn        ", 200, 75000,
                true, 0.19, " Liga De la Justicia", "jpa", Marca.MATTEL, Categoria.JUGUETERIA);

        Producto Balon = new Producto(4, "Balon Futbol     ", 30, 95000,
                true, 0.19, " Balon semi pro-fecional", "jpa", Marca.GOLTY, Categoria.DEPORTES);

        Producto Balon1 = new Producto(5, "Balon Basket Ball", 10, 85000,
                true, 0.19, " Balon principiantes", "jpa", Marca.GOLTY, Categoria.DEPORTES);

        Producto Batman = new Producto(6, "Caba de la noche ", 10, 105000,
                true, 0.19, " Liga de la justicia", "jpa", Marca.MATTEL, Categoria.JUGUETERIA);

        Producto Horno = new Producto(7, "Horno Tostador", 5, 700000,
                true, 0.19, " Horno Tostador pequeño ", "jpa", Marca.ASUS, Categoria.ELETRODOMESTICOS);

        Producto Laptop = new Producto(8, "Partatil 15", 15, 1550000,
                true, 0.19, " Portatil Negro 15' ", "jpa1", Marca.ASUS, Categoria.TECNOLOGIA);

        Producto Bicicleta = new Producto(9, "Todo terreno", 15, 350000,
                true, 0.19, " Portatil Negro 15' ", "jpa1", Marca.GOLTY, Categoria.DEPORTES);

        Producto Camiza = new Producto(10, "Polo", 10, 40000,
                true, 0.19, " Portatil Negro 15' ", "jpa1", Marca.OFFCORSS, Categoria.ROPA);


        CarritoDeCompras cdc = new CarritoDeCompras();// se crea objeto carrito de compras

        GestionCarritoDeCompras gcdc = new GestionCarritoDeCompras();//se crea objeto de carrito de compras

        Empresa Ecommerce = new Empresa("258933-6", "Ecommerce", "Calle 25 # 36-85", 3632290);

        //Crear cliente y administrador
        Cliente cliente = new Cliente(01, "Fabio ", "123", "fabiogonzalezmoreno@gmail.com", "3175479621", "Calle 23#-17-77",
                true, "1057575112", "CC", "Efectivo", "Bogota");

        Administrador administrador = new Administrador(001, "FABIO", "2126");

        Scanner entrada = new Scanner(System.in);



        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("1. Registro ");
            System.out.println("2. Iniciar sesión ");
            System.out.println("3. Recuperar Contraseña ");
            System.out.println("4. Agregar productos Al carrito");
            System.out.println("5. Agregar productos txt");
            System.out.println("6. Calcular costo de envio ");
            System.out.println("7. Generar factura");
            System.out.println("8. Cargar factura");
            System.out.println("9. Salir");
            System.out.println("-------------------------------");
            System.out.println("-  ingresa la opcion");
            System.out.println("-------------------------------");
            opcion = entrada.nextInt();
            GestionLogin gestionLogin = new GestionLogin();
            // usuario.settDatos();
            //usuario.settDatos2();

            switch (opcion) {
                case 1:
                    gestionLogin.registrUsuario(cliente, administrador);
                    break;

                case 2:
                    gestionLogin.inicioDeSesion(cliente, administrador);
                    //usuario1.inicioSesion(usuario1,cliente);
                    break;
                case 3:
                    gestionLogin.recuperarContraseña(cliente, administrador);
                    break;

                case 4:
                    //listaProductos.add(Televisor);
                    listaProductos.add(Lavadora);
                    listaProductos.add(SuperMan);
                    listaProductos.add(Balon);
                    listaProductos.add(Balon1);
                    listaProductos.add(Batman);//


                    // cdc.setProductos(listaProductos);//crea objeto carrito de compras
                    cdc.setProductos(facturaUtil.agregarProductos("listaProductos.txt"));//crea objeto carrito de compras
                    //cdc.setProductos(pi.dividirDatosProducto(prueba));
                    cdc = gcdc.añadirAlCarrito(cdc, listaProductos);
                    cdc = gcdc.calcularTotalConIva(cdc);

                    System.out.println(" 🛒Productos agregados al carrito de compras🛒");
                    break;
                case 5:
                    facturaUtil.agregarProductos("listaProductos.txt");
                    System.out.println(" \n🛒Productos agregados al carrito de compras🛒");
                    break;
                case 6:
                    System.out.println("El valor del envio de los productos es: " + gcdc.calcularCostoEnvio(cdc, cliente, gcdc));
                    break;
                case 7:
                    GestionFactura fac01 = new GestionFactura();
                    fac01.pagar(cliente, cdc, gcdc);
                    fac01.imprimirFactura(cdc, gcdc, Ecommerce, cliente);
                    FacturaUtill facturaText = new FacturaUtill();
                    System.out.println("TAMAÑO ARREGLO" + cdc.getProductos().size());
                    facturaText.escribirArchivo("factura001.txt", cdc, gcdc, Ecommerce, cliente);
                    break;

                case 8:
                    FacturaUtill leerTxt = new FacturaUtill();
                    leerTxt.leerArchivo("listaProductos.txt", cdc, gcdc, Ecommerce, cliente);

                    break;

                case 9:
                    gestionLogin.cerrarCesion();
                    break;
            }
        }
        while (opcion < 9);
        System.out.println("Opcion no valida");
    }
}
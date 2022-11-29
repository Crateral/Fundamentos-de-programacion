import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.GestionCarritoDeCompras;
import com.co.nttdata.ecommerce.logica.GestionFactura;
import com.co.nttdata.ecommerce.logica.GestionLogin;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        GestionCarritoDeCompras gc = new GestionCarritoDeCompras();
        CarritoDeCompras cc = new CarritoDeCompras();
        GestionLogin gu = new GestionLogin();
        Usuario us = new Usuario();
        List<Producto> listaProductos = new ArrayList<>();

        // Se crean los productos

        Producto pro1 = new Producto(1, "Licuadora", 3, 150000, true,
                0.19, "Producto Licuadora", "img Licuadora", Marca.SAMSUNG, Categoria.ELECTRODOMESTICOS);

        Producto pro2 = new Producto(2, "Bolso ", 20, 500000, true,
                0.19, "Producto Bolso", "img Bolso", Marca.VELEZ, Categoria.ACCESORIOS);

        Producto pro3 = new Producto(3, "Shampoo para Gatos", 2, 18000, false,
                0.19, "Producto Shampoo", "img Shampoo", Marca.CANAMOR, Categoria.MASCOTAS);

        Producto pro4 = new Producto(4, "Jeans ", 40, 180000, true,
                0.19, "Producto Jeans", "img Jeans", Marca.STUDIOF, Categoria.ROPA);

        Producto pro5 = new Producto(5, "Edredon", 11, 200000, true,
                0.19, "Producto Edredon", "img Edredon", Marca.DISTRIHOGAR, Categoria.HOGAR);

        Producto pro6 = new Producto(6, "Celular", 3, 2700000, true,
                0.19, "Producto Celular", "img Celular", Marca.IPHONE, Categoria.TECNOLOGIA);

        Producto pro7 = new Producto(7, "Tenis", 14, 350000, false,
                0.19, "Producto Tenis", "img tenis", Marca.ADIDAS, Categoria.DEPORTES);

        Producto pro8 = new Producto(8, "Lavadora", 3, 800000, true,
                0.19, "Producto Lavadora", "img Lavadora", Marca.LG, Categoria.ELECTRODOMESTICOS);

        Producto pro9 = new Producto(9, "Licuadora", 3, 15000.00, true,
                0.19, "Producto Licuadora", "img Licuadora", Marca.DISNEY, Categoria.JUGUETERIA);

        Producto pro10 = new Producto(10, "Televisor", 3, 2300000, false,
                0.19, "Producto Televisor", "img Televisor", Marca.KIA, Categoria.ELECTRODOMESTICOS);

        // Creacion de clientes

        Cliente nuevoCliente = new Cliente(11, "Ana Franco", "asd123", "1234",
                "cc", "ana@gmail.com", "23341", "Calle 26 # 2-5", "Bucaramanga",
                true, "Efectivo");

        //Creacion Administradores

        Administrador adminNuevo = new Administrador(221,"cc", "123456",
                "Maria", "maria@gmail.com","hi987",true);

        // Creacion de empresa
        Empresa datosEmpresa = new Empresa(3232, "AF-FG✨", "img Empresa",
                "Calle 26 # 2-5", "23432");


        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("1. Crear Usuario ");
            System.out.println("2. Iniciar sesión ");
            System.out.println("3. Agregar productos Al carrito");
            System.out.println("4. Calcular costo de envio ");
            System.out.println("5. Generar factura");
            System.out.println("6. Salir");
            System.out.println("-------------------------------");
            System.out.println("-  ingresa la opcion");
            System.out.println("-------------------------------");
            opcion = x.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Crear usuario");
                    gu.crearUsuario(nuevoCliente,adminNuevo);
                    break;
                case 2:
                    System.out.println(" Login usuario ");

                    gu.loguinUsuario(nuevoCliente,adminNuevo);



                    break;
                case 3:

                    //Se agregan 6 productos al carrito
                    listaProductos.add(pro1);
                    listaProductos.add(pro2);
                    listaProductos.add(pro4);
                    listaProductos.add(pro5);
                    listaProductos.add(pro6);
                    listaProductos.add(pro10);

                    cc.setProductos(listaProductos);
                    cc = gc.añadirAlCarrito(cc, listaProductos);
                    System.out.println(" - Calculando iva de productos 🛍");
                    cc = gc.calcularTotalConIva(cc);


                    break;
                case 4:

                    if (listaProductos.size() != 0) {
                        cc.setProductos(listaProductos);
                        cc = gc.calcularCostoEnvio(cc, nuevoCliente);
                        cc.setValorEnvio(cc.getValorEnvio());
                    } else {
                        System.out.println("No se encontraron productos en el carrito");
                    }

                    break;

                case 5:
                    if (listaProductos.size() != 0) {
                        cc.setProductos(listaProductos);
                        GestionFactura gf = new GestionFactura();
                        Factura fc = new Factura();
                        fc = gf.pagar(nuevoCliente, cc, datosEmpresa);
                        gf.imprimirFactura();
                    } else {
                        System.out.println("No se encontraron productos en el carrito");
                    }

                    break;
                case 6:
                    System.out.println("Sesion finalizada, hasta pronto ");
                    System.exit(0);
                    break;

            }


        }
        while (opcion < 7);
        System.out.println("ups algo salio mal - Opcion no valida");


    }
}
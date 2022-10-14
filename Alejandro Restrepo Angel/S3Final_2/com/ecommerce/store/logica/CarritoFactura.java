package com.ecommerce.store.logica;

import com.ecommerce.store.interfaces.Vistas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarritoFactura extends CarritoCompra implements Vistas {

    private double valorImpuesto, valorDescuento, neto, total;

    private void imprimirFactura(double impuesto, double descuento) {
        neto = calcularNeto();
        valorImpuesto = neto * (impuesto/100);
        valorDescuento = neto * (descuento/100);
        total = neto + valorImpuesto - valorDescuento;
        System.out.println("\n===========================================");
        System.out.println("Factura del compra");
        System.out.println("===========================================");
        mostrarCarrito();
        System.out.println("===========================================");
        System.out.println("Neto: " + neto);
        System.out.println("Descuento ["+ impuesto +"]%: " + valorDescuento);
        System.out.println("Impuesto ["+ descuento +"]%: " + valorImpuesto);
        System.out.println("Total a pagar: " + total);
        System.out.println("===========================================");
    }

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("Generar Factura");
        System.out.println("===========================================");
        System.out.print("Ingrese el impuesto: ");
        double impuesto = scanner.nextInt();
        System.out.print("Ingrese el descuento: ");
        double descuento = scanner.nextInt();
        imprimirFactura(impuesto, descuento);
    }
}

package org.sabello.appfacturas;

import org.sabello.appfacturas.modelo.*;


import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Sebastian");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = teclado.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese el producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(teclado.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(teclado.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(teclado.nextInt(), producto));

            System.out.println();
        }
        System.out.println(factura);

    }
}

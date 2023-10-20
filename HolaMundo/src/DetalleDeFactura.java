import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura o descripcion:");
        String nombreFactura = teclado.nextLine();

        System.out.println("Ingrese el precio 1");
        double precio1 = teclado.nextDouble();
        System.out.println("Ingrese el precio 2");
        double precio2 = teclado.nextDouble();

        float impuesto = 0.19f;
        double totalSinImpuesto = (precio1 + precio2);
        double totalConImpuesto = (precio1 + precio2) * impuesto;
        double total = totalSinImpuesto + totalConImpuesto;

        System.out.println("El nombre de la factura es: " + nombreFactura + "\nEl monto bruto es: " + totalSinImpuesto
        + "\nImpuesto: " + totalConImpuesto + "\nMonto total es: " + total );
    }
}

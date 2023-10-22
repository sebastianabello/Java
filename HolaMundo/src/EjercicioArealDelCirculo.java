import java.util.Scanner;

public class EjercicioArealDelCirculo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo para saber su area: ");
        double radio = teclado.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("area = " + area);
    }
}

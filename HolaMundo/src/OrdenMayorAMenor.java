import java.util.Scanner;

public class OrdenMayorAMenor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer valor:");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor:");
        int num2 = teclado.nextInt();

        String orden = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("Resultado es = " + orden);
    }
}

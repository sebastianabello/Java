import java.util.Scanner;

public class EjercicioOrdenamientoPrimeroConUltimo {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese numero:");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(numeros[9 - i]); // y el i-ésimo por el final
            System.out.println(numeros[i]); // mostramos el i-ésimo número por el principio
        }

    }
}

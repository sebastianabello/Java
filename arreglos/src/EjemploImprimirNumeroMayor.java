import java.util.Scanner;

public class EjemploImprimirNumeroMayor {
    public static void main(String[] args) {

        int[] arreglo = new int[7];

        Scanner teclado = new Scanner(System.in);

        for ( int i = 0; i < 7; i++) {
            System.out.print("Ingrese numero del 11 al 99: ");
            arreglo[i] = teclado.nextInt();
        }
        int max = 0;

        for (int i = 1; i < 7; i++) {
            //max = (max > arreglo[i])? max : arreglo[i];
            max = Math.max(max, arreglo[i]);
        }
        System.out.println("El mayor nuemro es: = " + max);
    }
}

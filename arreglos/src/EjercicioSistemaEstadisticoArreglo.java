import java.util.Scanner;

public class EjercicioSistemaEstadisticoArreglo {

    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int cant = teclado.nextInt();

        int[] arreglo = new int[cant];
        int sumaPositivos = 0, sumaNegativos = 0, contadorPos=0, contadorNeg=0;
        double promedioPositivo,promedioNegativo;

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese valor:");
            arreglo[i] = teclado.nextInt();
            if (arreglo[i] > 0) {
                sumaPositivos+= arreglo[i];
                contadorPos++;
            } else {
                sumaNegativos+= arreglo[i];
                contadorNeg++;
            }
        }

        promedioPositivo = (double) sumaPositivos/contadorPos;
        System.out.println("Cantidad de numeros positvios = " + contadorPos);
        System.out.println("promedioPositivo = " + promedioPositivo);
        promedioNegativo =(double) sumaNegativos/contadorNeg;
        System.out.println("promedioNegativo = " + promedioNegativo);
        System.out.println("Cantidad de numeros negativos = " + contadorNeg);
    }
}

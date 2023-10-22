import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploDeArreglosFor {
    public static void main(String[] args) {

        //Arreglo de int
        int[] numeros = new int[10];

        int totalNumeros = numeros.length;

        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3;
        }
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("Numeros " + k + " = " + numeros[k]);
        }


        //Arreglo de String

        String[] productos = new String[4];
        int total = productos.length;

        productos[0] = "Computador portatil";
        productos[1] = "Computador Escritorio";
        productos[2] = "Tablet";
        productos[3] = "Celular";

        Arrays.sort(productos);

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=== Usando foreach ===");
        for (String prod : productos) {
            System.out.println("Prod = " + prod);
        }

        System.out.println("=== Usando While ===");
        int i = 0;
        while (i < total) {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("=== Usando Do while ===");
        int j = 0;
        do {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);

    }
}

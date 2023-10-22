import java.util.Arrays;

public class EjemploDeArreglosForInverso {
    public static void main(String[] args) {

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

        System.out.println("=== Usando for inverso ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + (total - 1 - i) + " : " + productos[total - 1 - i]);
        }

        System.out.println("=== Usando for inverso 2 ===");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }


    }
}

public class EjemploMatrizBuscar {

    public static void main(String[] args) {

        int[][] matriz = {
                {35, 23, 33, 43},
                {15, 134, 53, 54},
                {34, 22, 476, 199}
        };

        int elementoBuscar = 199;
        boolean encontrado = false;

        int i = 0;
        int j = 0;
        buscar:
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado) {
            System.out.println("Numero " + elementoBuscar + " encontrado en la cordenada " + i + "," + j);
        } else {
            System.out.println(elementoBuscar);
        }
    }
}

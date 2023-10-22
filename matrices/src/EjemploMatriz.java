public class EjemploMatriz {
    public static void main(String[] args) {

        int[][] numero = new int[2][4];

        numero[0][0] = 1;
        numero[0][1] = 2;
        numero[0][2] = 3;
        numero[0][3] = 4;

        numero[1][0] = 11;
        numero[1][1] = 12;
        numero[1][2] = 13;
        numero[1][3] = 14;

        System.out.println("Numero de filas = " + numero.length);
        System.out.println("Numero de columnas = " + numero[0].length);

        System.out.println("Primer numero de la matriz = " + numero[0][0]);
        System.out.println("Ultimo numero de la matriz = " + numero[numero.length-1][numero[1].length-1]);


    }
}

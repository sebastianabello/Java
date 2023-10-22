public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombre = new String[3][2];

        nombre[0][0] = "pepe";
        nombre[0][1] = "pepa";
        nombre[1][0] = "juan";
        nombre[1][1] = "samuel";
        nombre[2][0] = "miryam";
        nombre[2][1] = "herly";

        System.out.println("Iterando con for:");
        for (int i = 0; i < nombre.length; i++) {

            for (int j = 0; j < nombre[i].length; j++) {
                System.out.print(nombre[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("Iterando con forEach:");
        for (String[] fila : nombre) {

            for (String nombres : fila) {
                System.out.print(nombres + "\t");
            }
            System.out.println();

        }

    }
}

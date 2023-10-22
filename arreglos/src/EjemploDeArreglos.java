public class EjemploDeArreglos {
    public static void main(String[] args) {

        //Arreglo de int
        int[] numeros = new int[4];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        //Fuera del alcance, al definir el arreglo inial
        //numero[4] = 5;


        //Arreglo de String
        String[] productos = new String[4];
        productos[0] = "Computador portatil";
        productos[1] = "Computador Escritorio";
        productos[2] = "Tablet";
        productos[3] = "Celular";

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);


    }
}

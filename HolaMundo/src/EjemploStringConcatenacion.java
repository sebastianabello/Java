public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profe = "Sebastina Abello";

        String detalle = curso + " Con el instructor " + profe;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + (numeroA + numeroB));
        //se ejecuta de izquierda a derecha
        System.out.println(numeroA + numeroB + detalle);

        //Metodo

        //concat
        String detalle2 = curso.concat(" con ".concat(profe));
        System.out.println("detalle2 = " + detalle2);


    }
}

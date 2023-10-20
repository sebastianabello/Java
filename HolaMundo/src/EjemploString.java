public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        //Metodos

        //Compara el valor de dos string
        boolean esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual); //true

        //En el caso de equalsIgnoreCase ignora las mayusculas y retorna si tiene los mismos caracteres.
        String curso3 = new String("Programacion java");
        esIgual = curso.equalsIgnoreCase(curso3);
        System.out.println("esIgual = " + esIgual); //true




    }
}

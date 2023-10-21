public class OperadorInstaceOf {
    public static void main(String[] args) {

        //String texto = new String("Creando un objeto de la clase String ... que tal!");

        //Integer num = new Integer(7);

        String texto = "Creando un objeto de la clase String ... que tal!";
        Integer num = 7;
        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);
    }
}

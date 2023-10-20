public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mi nombre es Sebastian Abello");

        String saludar = "Hola mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 =10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;
        nombre = "Sebastian";
        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("Nombre = " + nombre);
    }
}

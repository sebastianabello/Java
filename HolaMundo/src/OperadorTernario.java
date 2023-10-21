import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {


        //Variable = condicion ? si_es verdadero : si es falso;

        String variable = (5 > 3) ? "Es verdad" : "Es falso";
        System.out.println("Variable = " + variable);


        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas");
        matematicas = teclado.nextDouble();
        System.out.println("Ingrese la nota de ciencias");
        ciencias = teclado.nextDouble();
        System.out.println("Ingrese la nota de historia");
        historia = teclado.nextDouble();

        promedio = (matematicas + ciencias + historia) / 5;

        estado = promedio >= 5.49 ? "Aprobado" : "Desaprobado";
        System.out.println("estado = " + estado);


    }
}

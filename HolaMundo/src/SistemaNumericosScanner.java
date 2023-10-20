import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericosScanner {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        String numeroStr = teclado.nextLine();

        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

    }
}

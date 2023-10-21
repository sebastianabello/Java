import java.util.Scanner;

public class EjercicioEstanqueDeGasolina {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la medida actual en litros: ");
        double actualLitros = teclado.nextDouble();

        if(actualLitros == 70){
            System.out.println("Estanque lleno");
        } else if(actualLitros >= 60) {
            System.out.println("Estanque casi lleno");
        } else if (actualLitros >= 40) {
            System.out.println("Estanque 3/4");
        } else if (actualLitros >= 35) {
            System.out.println("Medio tanque");
        } else if (actualLitros >= 20) {
            System.out.println("suficiente");
        } else {
            System.out.println("Insuficiente");
        }

    }
}

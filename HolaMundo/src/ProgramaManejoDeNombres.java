import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre de su familiar:");
        String nom1 = teclado.nextLine();
        String nom1Nuevo = nom1.toUpperCase().charAt(1) + "." + nom1.substring(nom1.length()-2);
        System.out.print("Ingrese el primer nombre de su familiar:");
        String nom2 = teclado.nextLine();
        String nom2Nuevo = nom2.toUpperCase().charAt(1) + "." + nom2.substring(nom2.length()-2);
        System.out.print("Ingrese el primer nombre de su familiar:");
        String nom3 = teclado.nextLine();
        String nom3Nuevo = nom3.toUpperCase().charAt(1) + "." + nom3.substring(nom3.length()-2);

        String resultado = nom1Nuevo + "_" + nom2Nuevo + "_" + nom3Nuevo;

        System.out.println(resultado);

    }
}

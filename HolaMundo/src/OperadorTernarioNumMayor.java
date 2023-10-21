import java.util.Scanner;

public class OperadorTernarioNumMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num4 = teclado.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("EL numero mayor es: = " + max);


    }
}

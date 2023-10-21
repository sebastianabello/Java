import java.util.Scanner;

public class EjercicioBuscarNumeroMenor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantos numeros quiere ingresar?");
        int cant = teclado.nextInt();

        if (cant < 10) {
            System.out.println("ERROR: debe ingresar por lo menos 10 numeros");
        } else {
            int num = 0;
            int menor = Integer.MAX_VALUE;

            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese el valor " + (i+1));
                num = teclado.nextInt();
                menor = (num < menor) ? num : menor;
            }
            System.out.println("El numero menor es: "+ menor);
            if (menor < 10 ){
                System.out.println("El numero menor es menor que 10");
            } else {
                System.out.println("El numero menor es mayor o igual a 10");
            }
        }
    }
}

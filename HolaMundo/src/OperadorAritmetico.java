import javax.swing.*;
import java.util.jar.JarOutputStream;

public class OperadorAritmetico {
    public static void main(String[] args) {

        //Prioridad de izquierda a derecha

        int i = 5, j = 4;
        //suma
        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("suma = " + i + j);
        System.out.println("suma = " + (i + j));

        //Resta
        int resta = i - j;
        System.out.println("resta = " + resta);

        //Multiplicacion
        int multi = i * j;
        System.out.println("multi = " + multi);

        //Division
        float div = (float) i / j;
        System.out.println("div = " + div);

        //Resto
        int resto = i % j;
        System.out.println("resto = " + resto);
        int resto2 = 8 % 5;
        System.out.println("resto2 = " + resto2);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}

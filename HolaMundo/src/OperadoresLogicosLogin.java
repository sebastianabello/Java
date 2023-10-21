import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Sebastian";
        String password = "123456";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = teclado.next();

        System.out.println("Ingrese la contraseña");
        String p = teclado.next();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p)) {
            System.out.println("Bienvenido!!");
            esAutenticado = true;
        } else {
            System.out.println("Usuario o contraseña incorrecto!!");
        }

        if (esAutenticado) {
            System.out.println("Hola de nuevo, como estas ".concat(u).concat("!"));
        }


    }
}

import java.util.Arrays;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        for(int i = 0; i < trabalenguas.length(); i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.println("trabalenguas = " + Arrays.toString(trabalenguas.split("a")));
       
    }
}

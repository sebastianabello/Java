public class OperadoresIncrementales {
    public static void main(String[] args) {
        
        //Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //Post incremento 
        i = 2;
        System.out.println("inicial i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i; // i = i - 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        i = 2;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(++j) = " + (j++));

        //++a ---- incrementa a uno, y luego devuelve a.
        //a++ ---- Devuelve a y luego lo incrementa.
        //--a ---- Decrementa a en uno, luego devuelve a.
        //a-- ---- Devuelve a, luego decrementa a en uno

    }
}

public class WrapperInteger {
    public static void main(String[] args) {
        
        int intPrimitivo = 3234;
        Integer inObjeto = intPrimitivo;
        System.out.println("inObjeto = " + inObjeto);
        
        int num = inObjeto;
        System.out.println("num = " + num);
        int num2 = inObjeto.intValue();
        System.out.println("num2 = " + num2);
        
        String valorSting = "67000";
        Integer valor = Integer.valueOf(valorSting);
        System.out.println("valor = " + valor);

        //Se puede convertir de un numero menor a mayor sin perdida de info.
        //No Se puede convertir de un numero mayor a menor.
        
    }
}

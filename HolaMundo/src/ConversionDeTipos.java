public class ConversionDeTipos {
    public static void main(String[] args) {
        var numeroStr = "50";
        
        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        var realStr = "82939.32e-3";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        var logicoStr = "TrUe";
        var logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
    }
}

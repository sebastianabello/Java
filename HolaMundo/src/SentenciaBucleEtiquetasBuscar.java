public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tigres tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Econtrado = " + cantidad + " veces la palabra " + palabra + " en la frase");
    }
}

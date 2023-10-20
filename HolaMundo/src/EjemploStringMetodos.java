public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Sebastian";

        //length()
        System.out.println("nombre.lenhth() = " + nombre.length());
        //toUpperCase()
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        //toLowerCase
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        //equals()
        System.out.println("nombre.equals(Sebastian) = " + nombre.equals("Sebastian"));
        System.out.println("nombre.equals(sebastian) = " + nombre.equals("sebastian"));
        //equalsIgnoreCase()
        System.out.println("nombre.equalsIgnoreCase(Sebastian) = " + nombre.equalsIgnoreCase("Sebastian"));
        System.out.println("nombre.equalsIgnoreCase(sebastian) = " + nombre.equalsIgnoreCase("sebastian"));
        //compareTo()
        System.out.println("nombre.compareTo(Sebastian) = " + nombre.compareTo("Sebastian"));
        System.out.println("nombre.compareTo(Sebastian) = " + nombre.compareTo("Andres"));
        //charAt()
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));
        //subString()
        System.out.println("nombre.subString(1) = " + nombre.substring(1));
        System.out.println("nombre.subString(1) = " + nombre.substring(1,4)); //No se incluye el ultimo en este caso el 4
        //replace()
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        //indexOf()
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));//si no esta retorna -1
        //lastIndexOf()
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf('a'));//si no esta retorna -1
        //contains()
        System.out.println("trabalenguas.contains = " + trabalenguas.contains("t"));
        //startsWith()
        System.out.println("trabalenguas.startsWith(tr) = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.startsWith(Tr) = " + trabalenguas.startsWith("Tr"));//false determina mayusculas
        //endsWith()
        System.out.println("trabalenguas.endsWith(uas) = " + trabalenguas.endsWith("uas"));
        System.out.println("trabalenguas.endsWith(uAs) = " + trabalenguas.endsWith("uAs"));
        //trim()
        System.out.println("trabalenguas.trim() = " + trabalenguas.trim());
        System.out.println("   trabalenguas  ".trim());
    }
}

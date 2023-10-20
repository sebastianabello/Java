public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profe = "Sebastina Abello";
        
        String resultado = curso.concat(profe);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso.equals(resultado));

        //Transform
        String resultado2 = curso.transform(c -> {
            return c + " con " + profe;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        //remplace
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado3);
    }
}

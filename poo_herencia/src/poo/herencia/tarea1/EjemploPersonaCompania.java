package poo.herencia.tarea1;

public class EjemploPersonaCompania {

    public static void main(String[] args) {
        Gerente gerente = new Gerente(57000.00, 25,
                2000.00,"10321.322.3234",
                "Sebastian","Abello","cra132 #143 as342");
        gerente.aumentarRemuneracion(15);
        System.out.println(gerente);

        Cliente cliente = new Cliente(12,"10312323.323","Miryam", "urueña","cracasadr#reasd");

        System.out.println(cliente);
    }
}

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("mazda","mazda");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        Automovil toyota = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometro por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometro por litro " + subaru.calcularConsumo(300, 60));

        //Principio de ocultacion
        //Private, public, protected


        //Encapsulamiento
        //Es la apstraccion que tiene el objeto respecto a sus metodos
        //por ejemplo no me intereza como se fabrica un televisor solo lo compro y ya, solo se las cosas basicas que debo saber
    }
}

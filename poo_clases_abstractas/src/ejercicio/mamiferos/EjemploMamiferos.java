package ejercicio.mamiferos;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[6];
        Mamifero leon = new Leon("Sur africa", 5.7f, 5f, 20f, 1.3f, 120, 6, 120d);
        Mamifero tigre = new Tigre("risa", 130, 330, 300, 2.34f, 120, "Siberiano");
        Mamifero lobo = new Lobo("risa", 12.4f, 320, 200, "verde", 2.4f, 4, "Iberico");

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;


        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitad());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Colmillos:" + ((Canino) animal).getTamanioColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanioGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}

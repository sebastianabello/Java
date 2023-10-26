package ejercicio.mamiferos;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitad, float altura, float largo, float peso, String color, float tamanioColmillos, int numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza junto a su grupo de " + numCamada + " individuos en los bosques de " + habitad;
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cabernas de " + habitad;
    }

    @Override
    public String correr() {
        return "El Lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habitad;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " " + color + " aulla en luna llena";
    }
}

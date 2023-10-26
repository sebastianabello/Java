package ejercicio.mamiferos;

public class Leon extends Felino {

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitad, float altura, float largo, float peso, float tamanioGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitad, altura, largo, peso, tamanioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El Leon caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El Leon duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Leon corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Leon ruge fuerte a " + potenciaRugidoDecibel + " decibeles";
    }
}

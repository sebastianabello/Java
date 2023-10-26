package ejercicio.mamiferos;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitad, float altura, float largo, float peso, float tamanioGarras, int velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza solitario en los manglares y bosques monzónicos de " + habitad;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en la selvas de " + habitad;
    }

    @Override
    public String correr() {
        return "El Tigre " + especieTigre + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Ruge Tigre y agacha sus orejas";
    }
}

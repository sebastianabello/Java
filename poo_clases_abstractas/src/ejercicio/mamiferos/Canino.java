package ejercicio.mamiferos;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitad, float altura, float largo, float peso, String color, float tamanioColmillos) {
        super(habitad, altura, largo, peso);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }
}

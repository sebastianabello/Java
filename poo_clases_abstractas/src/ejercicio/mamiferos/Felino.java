package ejercicio.mamiferos;

abstract public class Felino extends Mamifero{
    protected float tamanioGarras;
    protected int velocidad;

    public Felino(String habitad, float altura, float largo, float peso, float tamanioGarras, int velocidad) {
        super(habitad, altura, largo, peso);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

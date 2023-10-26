package ejercicio.mamiferos;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitad, float altura, float largo, float peso, String color, float tamanioColmillos, int fuerzaMordida) {
        super(habitad, altura, largo, peso, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mordida de " + fuerzaMordida + " PSI, posee fuertes mandíbulas y grandes orejas redondeadas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String correr() {
        return "El perro africano corre en las llanuras aledañas a la sabana!";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerías nocturnas";
    }
}

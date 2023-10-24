import java.security.PublicKey;

public class Estudiante extends Persona{
    private final String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }
    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("grado = " + grado);
    }
}

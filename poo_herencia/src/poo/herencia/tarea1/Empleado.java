package poo.herencia.tarea1;

public class Empleado extends Persona {

    private double remuneracion;
    private int empleadoId;

    public Empleado(int empleadoId, double remuneracion, String numeroFiscal, String nombre, String apellido, String direccion) {
        super(numeroFiscal, nombre, apellido, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }
    @Override
    public String toString() {
        return "empleadoId = " + empleadoId
                + "\nremuneracion = " + remuneracion
                + "\n" + super.toString();
    }
}

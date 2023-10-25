package org.sabello.pooherencia;

public class Alumnointernacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public Alumnointernacional(){
        System.out.println("AlumnoInternacional: inicializando constructor.......");
    }
    public Alumnointernacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumnointernacional(String nombre, String apellido,String pais) {
        super(nombre,apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}

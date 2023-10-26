package org.sabello.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.nombre = "Sebastian";
        alumno.setApellido("Abello");
        alumno.setInstitucion("Instituto nacional");
        alumno.setNotaBiologia(7.4);
        alumno.setNotaMatematica(5.4);
        alumno.setNotaHistoria(7.9);

        Alumnointernacional alumnoint = new Alumnointernacional();
        alumnoint.setNombre("Samuel");
        alumnoint.setApellido("Eduardo");
        alumnoint.setPais("Australia");
        alumnoint.setEdad(15);
        alumnoint.setInstitucion("Instituto Nacional");
        alumnoint.setNotaIdiomas(6.7);
        alumnoint.setNotaBiologia(7.4);
        alumnoint.setNotaMatematica(8.0);
        alumnoint.setNotaHistoria(5.3);


        Profesor profesor = new Profesor();
        profesor.setNombre("luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");


        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());
        System.out.println(alumnoint.getNombre()
                + " " + alumnoint.getApellido()
                + " " + alumnoint.getPais());


        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());


        Class clase = alumnoint.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " Es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}

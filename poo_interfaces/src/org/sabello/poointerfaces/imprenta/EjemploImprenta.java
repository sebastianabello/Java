package org.sabello.poointerfaces.imprenta;

import org.sabello.poointerfaces.imprenta.modelo.*;
import static org.sabello.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral","Sebastian Abello","Ingeniera de sistemas");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");

        Libro libro = new Libro("Erich Gama","Patrones de diseño: Elem. Reusables POO"
                , PROGRAMACION);
        libro.addPagina(new Paginas("Patron singleton"))
                .addPagina(new Paginas("Patron Observador"))
                .addPagina(new Paginas("Patron Factory"))
                .addPagina(new Paginas("Patron composite"))
                .addPagina(new Paginas("Patron Fascade"));

        Informe informe = new Informe("samuel","Eduardo gonsalo","Estudio microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}

package org.sabello.ejemplo.set;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {


        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1,"Sebastian",19));
        lista.add(new Persona(2,"sofia",18));
        lista.add(new Persona(3,"Eduardo",20));
        lista.add(new Persona(4,"Cristian",22));
        lista.add(new Persona(5,"Melisa",21));

        System.out.println("----------------For---------------");
        
        //Recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba " + lista.get(i).getNombre());
        }
        System.out.println("----------------ForEach---------------");
        //Recorrer por elemento
        for (Persona perso: lista) {
            System.out.println("Prueba " + perso.getNombre());

        }
    }
}

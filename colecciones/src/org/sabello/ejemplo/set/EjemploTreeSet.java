package org.sabello.ejemplo.set;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>();

        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");

        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        System.out.println("numeros = " + numeros);
    }
}

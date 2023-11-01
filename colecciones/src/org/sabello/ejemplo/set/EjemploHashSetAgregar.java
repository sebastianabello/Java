package org.sabello.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        hs.add("tres");
        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados = " + b);
        System.out.println(hs);
    }
}

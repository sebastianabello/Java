package org.sabello.recursividad.ejemplo;

import org.sabello.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete pc ATX");
        Componente poder = new Componente("Fuente de poder");
        Componente placaMadre = new Componente("Placa madre");
        Componente cpu = new Componente("Cpu AMD ryzen 5");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU");
        Componente gpuRam1 = new Componente("4Ram");
        Componente gpuRam2 = new Componente("4Ram");
        Componente gpuVentilador = new Componente("Ventiladores");
        Componente ram = new Componente("32 ram");
        Componente ssd = new Componente("Disco ssd 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam2)
                .addComponente(gpuRam1)
                .addComponente(gpuVentilador);
        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        metodoRecursivoJava8(pc,0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));
    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo,nivel + 1)));
    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.tieneHijos()) {
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }
}

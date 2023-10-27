package org.sabello.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10,divisor);
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("Se dectecto una excepcion: por favor ingrese un valor numerico " + nfe.getMessage());
            main(args);
        } catch (DivicionPorZeroException ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + ae.getMessage());
            main(args);
        }
        System.out.println("Continuamos el flujo de la aplicacion");

    }
}

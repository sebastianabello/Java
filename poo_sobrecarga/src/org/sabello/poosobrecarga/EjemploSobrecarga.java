package org.sabello.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora();

        System.out.println("Sumar int 3: " + cal.sumar(2,3,4));
        System.out.println("Sumar int: " + cal.sumar(2,3));
        System.out.println("Sumar int, float: " + cal.sumar(2,3.4F));

    }
}

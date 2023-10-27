package org.sabello.pooexcepciones.ejemplo;

public class Calculadora {
    public double dividir(int numerador, int dividendo) throws DivicionPorZeroException {

        if (dividendo == 0) {
            throw new DivicionPorZeroException("No se puede dividir por cero!");
        }
        return (double) numerador / dividendo;
    }
}

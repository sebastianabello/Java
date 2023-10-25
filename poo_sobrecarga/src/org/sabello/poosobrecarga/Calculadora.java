package org.sabello.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return a + b;

    }
    public float sumar(float a, float b){
        return a + b;
    }
    public float sumar(int i, float j){
        return i + j;
    }
    public float sumar(float i, int j){
        return i + j;
    }
    public double sumar(double i, double j){
        return i + j;
    }
    public int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
}

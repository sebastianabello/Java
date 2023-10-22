public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;
    int capacidadTanque = 40;

    public String verDetalle() {
        return "Fabricante = " + this.fabricante +
                "\nModelo = " + this.modelo +
                "\nColor = " + this.color +
                "\nCilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm.";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!!.";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadTanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadTanque * (porcentajeBencina/100f));
    }
}

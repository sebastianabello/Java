import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Sebastian", "Maria", "Eduardo",};
        int count = nombres.length;

        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("Maria")) {
                continue;
            };
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println(i + ".- " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema");
        }
    }
}

import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {

        String per1 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de amigo o familiar:");
        String per2 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de amigo o familiar:");
        String per3 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de amigo o familiar:");

        String nomLargo = per1.split(" ")[0].length() > per2.split(" ")[0].length() ? per1 : per2;
        nomLargo = per3.split(" ")[0].length() > nomLargo.split(" ")[0].length() ? per3 : nomLargo;

        System.out.println("El nombre mas largo es = " + nomLargo);
    }
}

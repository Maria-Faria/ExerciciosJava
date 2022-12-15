package exercicios;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        double rad, grau;

        rad = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o ângulo em radianos: "));

        grau = rad * 180/Math.PI;

        JOptionPane.showMessageDialog(null, rad + " radianos = " + grau + " graus");
    }
}

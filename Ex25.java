package exercicios;

import javax.swing.JOptionPane;

public class Ex25 {
    public static void main(String[] args) {
        double acres, m2;

        acres = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da área em acres:"));

        m2 = acres * 4048.58;

        JOptionPane.showMessageDialog(null, acres + " acres = " + m2 + " m²");
    }
}

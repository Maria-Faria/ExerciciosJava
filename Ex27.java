package exercicios;

import javax.swing.JOptionPane;

public class Ex27 {
    public static void main(String[] args) {
        double hec, m2;

        hec = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da área em hectares:"));

        m2 = hec * 10000;

        JOptionPane.showMessageDialog(null, hec + " hectares = " + m2 + " m²");
    }
}

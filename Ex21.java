package exercicios;

import javax.swing.JOptionPane;

public class Ex21 {
    public static void main(String[] args) {
        double libra, kg;

        libra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a massa em libras:"));

        kg = libra * 0.45;

        JOptionPane.showMessageDialog(null, libra + " libras = " + kg + " quilogramas");
    }
}

package exercicios;

import javax.swing.JOptionPane;

public class Ex19 {
    public static void main(String[] args) {
        double litro, metro;

        litro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o volume em litros: "));

        metro = litro/1000;

        JOptionPane.showMessageDialog(null, litro + " litros = " + metro + " m³");
    }
}

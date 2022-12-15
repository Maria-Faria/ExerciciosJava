package exercicios;

import javax.swing.JOptionPane;

public class Ex39 {
    public static void main(String[] args) {
        double g1, g2, g3;

        g1 = 780000 * 0.46;
        g2 = 780000 * 0.32;
        g3 = 780000 - g1 - g2;

        JOptionPane.showMessageDialog(null, String.format("Ganhador 1: R$%.2f\nGanhador 2: R$%.2f\nGanhador 3: R$%.2f", g1, g2, g3));
    }
}

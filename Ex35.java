package exercicios;

import javax.swing.JOptionPane;

public class Ex35 {
    public static void main(String[] args) {
        double a, b, hip;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do cateto 'a': "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do cateto 'b': "));

        hip = Math.sqrt((a * a) + (b * b));

        JOptionPane.showMessageDialog(null, "Valor da hipotenusa: " + hip);
    }
}

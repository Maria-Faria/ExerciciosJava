package exercicios;

import javax.swing.JOptionPane;

public class Ex29 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, media;

        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 3:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 4:"));

        media =(n1 + n2 + n3 + n4)/4;

        JOptionPane.showMessageDialog(null, "Média aritmética das notas = " + media);

    }
}

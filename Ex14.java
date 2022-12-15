package exercicios;

import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        double grau, rad;
        
        grau = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o ângulo em graus"));

        rad = grau * Math.PI/180;

        JOptionPane.showMessageDialog(null, grau + " graus = " + rad + " radianos");
    }
}

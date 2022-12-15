package exercicios;

import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        double milha, km;

        milha = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a distância em milhas"));

        km = 1.61 * milha;

        JOptionPane.showMessageDialog(null, milha + "milhas = " + km + " km");
    }       
}

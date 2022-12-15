package exercicios;

import javax.swing.JOptionPane;

public class Ex42 {
    public static void main(String[] args) {
        double salBase, salFinal;

        salBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário-base do funcionário: "));
    
        salFinal = salBase + (salBase * 0.05);
        salFinal -= salBase * 0.07;

        JOptionPane.showMessageDialog(null, String.format("Salário final do funcionário: R$%.2f", salFinal));
    }
}

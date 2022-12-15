package exercicios;

import javax.swing.JOptionPane;

public class Ex46 {
    public static void main(String[] args) {
        String num, num2;

        num = JOptionPane.showInputDialog(null, "Digite um número inteiro positivo de três dígitos (de 100 a 999): ");
    
        while(Integer.parseInt(num) < 100 || Integer.parseInt(num) > 999) {
            num = JOptionPane.showInputDialog(null, "Número inválido! Digite um número inteiro positivo de três dígitos (de 100 a 999): ");
        }

        num2 = num.substring(2) + num.substring(1, 2) + num.substring(0, 1);

        JOptionPane.showMessageDialog(null, num2);

    }
}

/* Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
 * fórmula de conversão é: C = K - 273.15, sendo C a temperatura em Celsius e K a 
 * temperatura em Kelvin */

package exercicios;

import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        double k, c;

        k = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em graus Kelvin"));

        c = k - 273.15;

        JOptionPane.showMessageDialog(null, k + "K = " + c + "°C");
    }
}

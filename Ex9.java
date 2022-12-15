/* Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
 * fórmula de conversão é: K = C + 273.15, sendo C a temperatura em Celsius e K a 
 * temperatura em Kelvin */

package exercicios;

import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
        double c, k;

        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em graus Celsius"));

        k = c + 273.15;

        JOptionPane.showMessageDialog(null, c + "°C = " + k + "K");
    }
}

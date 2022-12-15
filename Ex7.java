/* Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
 * A fórmula de conversão é: C = 5.0 * (F - 32.0)/9.0, sendo C a temperatura em Celsius
 * e F a temperatura em Fahrenheit */

package exercicios;

import javax.swing.JOptionPane;

public class Ex7{
    public static void main(String[] args) {
        float f, c;

        f = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a temperatura em Fahrenheit"));

        c = 5 * (f - 32)/9;

        JOptionPane.showMessageDialog(null, f + "°F = " + c + "°C");
        //String.format("%.2f°C", c) -> formatar float
    }
}
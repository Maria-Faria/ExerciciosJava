/* Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
 * A fórmula de conversão é: F = C * (9.0/5.0) + 32.0, sendo F a temperatura em Fahrenheit
 * e C a temperatura em Celsius */

package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        float c, f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        c = sc.nextFloat();
        sc.close();

        f = (c * (9/5f)) + 32;

        System.out.printf("%.1f°C = %.1f°F", c, f);
    }
}

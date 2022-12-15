/* Leia uma velocidade em km/h (quilômetros por hora) e apresente-a convertida em m/s
 * (metros por segundo). A fórmula de conversão é: M = K/3.6, sendo K a velocidade em
 * km/h e M em m/s */

package exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        double km, m;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade (em km/h): ");
        km = sc.nextDouble();
        sc.close();

        m = km/3.6;

        System.out.println("------------------------------");
        System.out.printf("%.2f km/s -> %.2f m/s", km, m);
    }
}

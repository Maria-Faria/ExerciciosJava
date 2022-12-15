package exercicios;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        double v1, v2, v3, soma;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        v1 = sc.nextDouble();

        System.out.print("Digite o 2º valor: ");
        v2 = sc.nextDouble();

        System.out.print("Digite o 3º valor: ");
        v3 = sc.nextDouble();

        sc.close();

        soma = (v1 * v1) + (v2 * v2) + (v3 * v3);

        System.out.println("-------------------------------------------");
        System.out.printf("%.2f² + %.2f² + %.2f² = %.2f", v1, v2, v3, soma);
    }
}

package exercicios;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        double jardas, metros;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento em jardas: ");
        jardas = sc.nextDouble();

        sc.close();

        metros = 0.91 * jardas;

        System.out.println("------------------------------------------------------------");
        System.out.printf("%.2f jardas = %.2f metros", jardas, metros);
    }
}

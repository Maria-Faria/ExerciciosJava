package exercicios;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        double raio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();

        sc.close();

        System.out.println("------------------------------------");
        System.out.println("Área do círculo: " + (3.141592 * (raio * raio)));
    }
}

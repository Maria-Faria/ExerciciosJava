package exercicios;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();

        sc.close();

        System.out.println("--------------------------");
        System.out.printf("Valor com desconto: R$%.2f", (valor - (valor * 0.12)));
    }
}

package exercicios;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        double valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor total: ");
        valorTotal = sc.nextDouble();

        sc.close();

        System.out.println("-----------------------------------");
        System.out.printf("Total a pagar com desconto de 10%%: R$%.2f\n", valorTotal - (valorTotal * 0.10));
        System.out.printf("Valor total de cada parcela (em 3x sem juros): R$%.2f\n", valorTotal/3);
        System.out.printf("Comissão do vendedor (caso a venda seja a vista): R$%.2f\n", (valorTotal - (valorTotal * 0.10)) * 0.05);
        System.out.printf("Comissão do vendedor (caso a venda seja parcelada): R$%.2f", valorTotal * 0.05);
    }
}

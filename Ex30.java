package exercicios;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        double real, cot;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em real: ");
        real = sc.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        cot = sc.nextDouble();

        sc.close();

        System.out.println("--------------------------------------");
        System.out.printf("R$%.2f = US$%.2f", real, (real / cot));
    }    
}

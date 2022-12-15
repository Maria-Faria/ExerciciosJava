package exercicios;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        double valorHora, sal;
        int numHora;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da hora de trabalho (em reais): ");
        valorHora = sc.nextDouble();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        numHora = sc.nextInt();

        sc.close();

        sal = numHora * valorHora;

        System.out.println("------------------------------------------");
        System.out.printf("Valor a ser pago ao funcionário: R$%.2f", sal + (sal * 0.10));
    }
}

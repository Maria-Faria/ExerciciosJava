package exercicios;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        double m2, acres;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da área em m²: ");
        m2 = sc.nextDouble();

        sc.close();

        acres = m2 * 0.000247;

        System.out.println("----------------------------------------------");
        System.out.printf("%.2f m² = %.2f acres", m2, acres);
    }
}

package exercicios;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        double m2, hec;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da área em metros quadrados: ");
        m2 = sc.nextDouble();

        sc.close();

        hec = m2 * 0.0001;

        System.out.println("--------------------------------------------");
        System.out.printf("%.2f m2 = %.2f hectares", m2, hec);
    }
}

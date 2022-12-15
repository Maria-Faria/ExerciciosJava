package exercicios;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        double kg, libra;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a massa em quilogramas: ");
        kg = sc.nextDouble();

        sc.close();

        libra = kg/0.45;

        System.out.printf("%.2f kg = %.2f libras", kg, libra);
    }
}

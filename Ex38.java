package exercicios;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        double sal;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        sal = sc.nextDouble();

        sc.close();

        System.out.println("------------------------");
        System.out.printf("Valor do novo salário: R$%.2f", (sal + (sal * 0.25)));
    }
}

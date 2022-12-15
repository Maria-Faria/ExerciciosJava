package exercicios;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        String num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número de 4 dígitos: ");
        num = sc.nextLine();

        sc.close();

        System.out.println("---------------------------------");

        System.out.println(num.substring(0, 1));
        System.out.println(num.substring(1, 2));
        System.out.println(num.substring(2, 3));
        System.out.println(num.substring(3));


    }
}

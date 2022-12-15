/* Leia um número real e imprima o resultado do quadrado desse número */

package exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        num = sc.nextDouble();

        sc.close();

        System.out.println("-------------------------------------");
        System.out.printf("%.1f² = %.1f", num, (num * num));
    }    
}

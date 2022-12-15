/* Faça um programa que leia um número real e o imprima */

package exercicios;

import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
        float num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        num = sc.nextFloat();

        sc.close();

        System.out.println("Número digitado: " + num);
   }
}

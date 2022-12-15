/* Leia um número real e imprima a quinta parte desse número */

package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        float num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        num = sc.nextFloat();

        sc.close();
        
        System.out.println("----------------------------");
        System.out.printf("%.1f / 5 = %.1f", num, (num/5));
    }    
}

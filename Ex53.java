/*Faça um programa para ler as dimensões de um terreno (comprimento C e largura L),
 * bem como o preço do metro de tela P. Imprima o custo para cercar este mesmo terreno
 * com tela.*/

package exercicios;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        double c, l, p, perimetro;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento do terreno: ");
        c = sc.nextDouble();

        System.out.print("Informe a largura do terreno: ");
        l = sc.nextDouble();

        System.out.print("Informe o preço do metro de tela: ");
        p = sc.nextDouble();

        sc.close();

        perimetro = (2 * c) + (2 * l);

        System.out.println("-----------------------------------------");
        System.out.printf("O custo para cercar este terreno é de R$%.2f", perimetro * p);
    }
}
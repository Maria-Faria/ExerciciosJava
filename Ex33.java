package exercicios;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        double lado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        lado = sc.nextDouble();

        sc.close();

        System.out.println("-------------------------------------------------");
        System.out.println("Área do quadrado: " + (lado * lado));
    }
}

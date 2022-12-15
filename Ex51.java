/*Escreva um programa que leia as coordenadas X e Y de pontos no R² e calcule sua
sua distância de origem*/

package exercicios;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        double x, y, d;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ponto X: ");
        x = sc.nextDouble();

        System.out.print("Insira o ponto Y: ");
        y = sc.nextDouble();

        sc.close();

        d = Math.sqrt((x * x) + (y * y));

        System.out.println("----------------------------------");
        System.out.println("A distância desse ponto da origem é: " + d);
    }    
}

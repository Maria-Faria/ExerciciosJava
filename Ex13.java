package exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        double km, milha;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a distância em km: ");
        km = sc.nextDouble();

        sc.close();
        
        milha = km/1.61;

        System.out.println(km + " km -> " + milha + " milhas");
    }
}

package exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        double pol, cm;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento em polegadas: ");
        pol = sc.nextDouble();

        sc.close();

        cm = pol * 2.54;

        System.out.println("--------------------------------------------");
        System.out.println(pol + " polegadas = " + cm + " centímetros");
    }
}

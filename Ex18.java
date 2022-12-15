package exercicios;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        double volume, litro;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o volume em metros cúbicos: ");
        volume = sc.nextDouble();

        sc.close();

        litro = 1000 * volume;

        System.out.println(volume + " m³ = " + litro + " litros");
    }
}

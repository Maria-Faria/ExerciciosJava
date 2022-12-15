package exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        double m, km;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a velocidade em m/s (metros por segundo): ");
        m = sc.nextDouble();

        sc.close();
        
        km = m * 3.6;

        System.out.println(m + " m/s ->" + km + " km/h");
    }
}

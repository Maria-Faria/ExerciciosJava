package exercicios;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        char letra, letra2;
        int ascii;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        letra = sc.next().charAt(0);

        sc.close();
       
        ascii = letra - 32;

        letra2 = (char)ascii;

        System.out.println(letra2);
    }
}
package exercicios;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        int hora, min, seg, duracao, novoHorario;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe abaixo o horário de início da experiência: ");

        System.out.print("Hora: ");
        hora = sc.nextInt();

        System.out.print("Minuto: ");
        min = sc.nextInt();

        System.out.print("Segundo: ");
        seg = sc.nextInt();

        System.out.println("------------------------------------");
        System.out.print("Duração (em segundos) da experiência: ");
        duracao = sc.nextInt();

        sc.close();

        novoHorario = duracao + seg;
        min += novoHorario/60;
        seg = novoHorario % 60;
        hora += min/60;
        min = min % 60;

        System.out.println("------------------------------------");
        System.out.printf("Horário do término da experiência: %d : %d : %d", hora, min, seg);
    }
}

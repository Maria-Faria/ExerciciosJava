/*Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de
 sua idade e do ano atual*/

package exercicios;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Ex50 {
    public static void main(String[] args) {
        int idade, ano;

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));

        LocalDate anoAtual = LocalDate.now();
        ano = anoAtual.getYear();

        JOptionPane.showMessageDialog(null, "Você nasceu em " + (ano - idade));
    }
}

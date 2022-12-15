/* Faça um programa que leia um número inteiro e o imprima */

package exercicios;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));

        JOptionPane.showMessageDialog(null, "Número digitado: " + num);

    }
}

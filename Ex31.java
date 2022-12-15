package exercicios;

import javax.swing.JOptionPane;

public class Ex31 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));

        JOptionPane.showMessageDialog(null, "Antecessor de " + num + ": " + (num - 1) + "\nSucessor de " + num  + ":" + (num + 1));
    }
}
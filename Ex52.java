/*Três amigos jogaram na loteria. Caso eles ganhem, o prêmio deve ser repartido
 * proporcionalmente ao valor que cada um deu para a realização da aposta. Faça um programa
 * que leia quanto cada apostador investiu, o valor do prêmio, e imprima quanto cada um
 * ganharia do prêmio com base no valor investido.*/

package exercicios;

import javax.swing.JOptionPane;

public class Ex52 {
    public static void main(String[] args) {
        double a1, a2, a3, aposta, premio, p1, p2, p3;

        a1 = Double.parseDouble(JOptionPane.showInputDialog(null,"AMIGO 1\nDigite o valor da sua aposta: "));
        a2 = Double.parseDouble(JOptionPane.showInputDialog(null,"AMIGO 2\nDigite o valor da sua aposta: "));
        a3 = Double.parseDouble(JOptionPane.showInputDialog(null,"AMIGO 3\nDigite o valor da sua aposta: "));
        premio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do prêmio: "));
        
        aposta = a1 + a2 + a3;
        p1 = (a1 * 100)/aposta;
        p2 = (a2 * 100)/aposta;
        p3 = (a3 * 100)/aposta;

        JOptionPane.showMessageDialog(null, String.format("O amigo 1 irá receber: R$%.2f", premio * (p1/100)));
        JOptionPane.showMessageDialog(null, String.format("O amigo 2 irá receber: R$%.2f", premio * (p2/100)));
        JOptionPane.showMessageDialog(null, String.format("O amigo 3 irá receber: R$%.2f", premio * (p3/100)));
    }
}

/* Peça ao usuário para digitar três valores inteiros e imprima a soma deles */

package exercicios;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int i, soma = 0;
        int num[] = new int[3];
        
        for(i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º valor inteiro"));
            soma += num[i];
        }   

        JOptionPane.showMessageDialog(null, num[0] + " + " + num[1] + " + " + num[2] + " = " + soma);
        
    }
}

package exercicios;

import javax.swing.JOptionPane;

public class Ex32 {
    public static void main(String[] args) {
        int num, calculo;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));

        calculo = ((3 * num) + 1) + ((2 * num) - 1);

        JOptionPane.showMessageDialog(null, "Resultado = " + calculo);
    }    
}

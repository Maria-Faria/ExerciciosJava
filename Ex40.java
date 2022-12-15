package exercicios;

import javax.swing.JOptionPane;

public class Ex40 {
    public static void main(String[] args) {
        int dia;
        double pg;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de dias trabalhados pelo encanador: "));

        pg = (30 * dia) - ((30 * dia) * 0.08);

        JOptionPane.showMessageDialog(null, String.format("Quantia a ser paga = R$%.2f", pg));
    }
}

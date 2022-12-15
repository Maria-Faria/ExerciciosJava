package exercicios;

import javax.swing.JOptionPane;

public class Ex48 {
    public static void main(String[] args) {
        int seg;

        seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor em segundos: "));

        JOptionPane.showMessageDialog(null, String.format("%d segundos = %d horas, %d minutos e %d segundos", seg, seg/3600, (seg % 3600)/60, (seg % 60)));
    }
}

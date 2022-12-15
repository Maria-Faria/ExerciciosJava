package exercicios;

import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
        double metros, jardas;

        metros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento em metros:"));

        jardas = metros/0.91;

        JOptionPane.showMessageDialog(null, metros + " metros = " + jardas + " jardas");
    }
}

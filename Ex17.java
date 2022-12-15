package exercicios;

import javax.swing.JOptionPane;

public class Ex17 {
    public static void main(String[] args) {
        double cm, pol;
        
        cm = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento em centímetros: "));

        pol = cm/2.54;

        JOptionPane.showMessageDialog(null, cm  + " centímetros = " + pol + " polegadas");
    }
}

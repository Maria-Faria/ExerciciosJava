package exercicios;

import javax.swing.JOptionPane;

public class Ex36 {
    public static void main(String[] args) {
        double altura, raio, vol;

        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do cilindro: "));
        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio do cilindro: "));

        vol = 3.141592 * (raio * raio) * altura;

        JOptionPane.showMessageDialog(null, "Volume do cilindro: " + vol);
    }
}

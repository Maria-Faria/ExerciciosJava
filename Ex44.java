package exercicios;

import javax.swing.JOptionPane;

public class Ex44 {
    public static void main(String[] args) {
        double alturaDegrau, alturaUser;

        alturaDegrau = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do degrau da escada: "));
        alturaUser = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura que você deseja alcançar subindo a escada: "));

        JOptionPane.showMessageDialog(null, "Você precisa subir " + (alturaUser/alturaDegrau) + " degraus para atingir seu objetivo");
    }
}

package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int numeroDigitado, soma, i = 1;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digitite um número");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        soma = numeroDigitado;
        while (i <= 100) {
            soma = soma +2;
            System.out.println(soma);
            i++;
        }
    }
}

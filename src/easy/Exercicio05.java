package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        String numDigitado1String = JOptionPane.showInputDialog("Digite o primeiro número");
        double num1 = Double.parseDouble(numDigitado1String);
        String numDigitado2String = JOptionPane.showInputDialog("Digite o segundo número");
        double num2 = Double.parseDouble(numDigitado2String);
        String numDigitado3String = JOptionPane.showInputDialog("Digite o terceiro número");
        double num3 = Double.parseDouble(numDigitado3String);
        double soma = num1 + num2 + num3;
        double subtracao = num1 - num2 - num3;
        double multiplicacao = num1 * num2 * num3;
        double media = soma / 3;
        System.out.println("A soma dos números digitados é: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Média"+media);
    }
}

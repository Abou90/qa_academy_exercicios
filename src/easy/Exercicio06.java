package easy;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        String notaDigitada1String = JOptionPane.showInputDialog("Digite a primeira nota.");
        double nota1 = Double.parseDouble(notaDigitada1String);
        String notaDigitada2String = JOptionPane.showInputDialog("Digite a segunda nota.");
        double nota2 = Double.parseDouble(notaDigitada2String);
        double media = (nota1+nota2)/2;
        if(media>5) {
            System.out.println("Aprovado");
        }
        if(media<5) {
            System.out.println("Reprovado");
        }
        if(media==5) {
            System.out.println("Exame");
        }
        System.out.println("Média é: "+media);
    }
}
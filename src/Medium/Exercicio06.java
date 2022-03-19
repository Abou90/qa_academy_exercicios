package Medium;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int i, fatorial;
        String fatorialStg = JOptionPane.showInputDialog("Digite um número");
        fatorial = Integer.parseInt(fatorialStg);
        i = fatorial;
        while (i >= 1) {
            fatorial = fatorial * (i-1);
            System.out.println("O fatorial será "+fatorial);
            i--;
        }
    }
}

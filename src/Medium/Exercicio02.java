package Medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double valorInvest, taxaJuros = 0.05, valorJuros, valorTotal;
        int i = 1;
        String valorInvestStg = JOptionPane.showInputDialog("Digite o valor a ser investido");
        valorInvest = Double.parseDouble(valorInvestStg);
        valorTotal = valorInvest;
        while (i <= 10) {
            valorTotal = (valorTotal*taxaJuros)+valorTotal;
            i=i+1;
        }
        valorJuros = valorTotal-valorInvest;
        System.out.println("Você investiu: "+valorInvest);
        System.out.println("Rendeu: "+valorJuros+" de Juros");
        System.out.println("O valor total são: "+valorTotal);
    }
}

package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double valorInvest, taxaJuros = 0.05, valorJuros = 0, valorTotal;
        int i = 1;
        String valorInvestStg = JOptionPane.showInputDialog("Digite o valor a ser investido");
        valorInvest = Double.parseDouble(valorInvestStg);
        while (i <= 10) {
            valorJuros = (valorInvest * taxaJuros) + valorJuros;
		    i = i+1;
        }
        valorTotal = valorJuros + valorInvest;
        System.out.println("Você investiu: "+valorInvest);
        System.out.println("Rendeu "+valorJuros+" de Juros");
        System.out.println("O valor total são: "+valorTotal);
    }
}

package Medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int numDigitado, numMenor=0;
        int i=1;
        while (i <= 5) {
            String numDigitadoStg = JOptionPane.showInputDialog("Digite um número");
            numDigitado = Integer.parseInt(numDigitadoStg);
            if (numDigitado < numMenor || i == 1) {
                numMenor = numDigitado;
            }
            i++;
        }
        System.out.println("O menor número digitado é o nº "+numMenor);
    }
}

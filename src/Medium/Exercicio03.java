package Medium;

public class Exercicio03 {
    public static void main(String[] args) {
        int soma = 0, i = 0;
        while (i <= 1000) {
            soma = i + soma;
            if (soma >= 1500) {
                break;
            }
            i++;
            System.out.println(soma);
        }
    }
}

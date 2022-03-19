package Medium;

public class Exercicio04 {
    public static void main(String[] args) {
        int mult=1;
        int i = 1;
        while (i <= 1000) {
            mult = mult * i;
            if (mult >= 1000) {
                mult = 1;
            }
            System.out.println(mult);
            i++;
        }
    }
}

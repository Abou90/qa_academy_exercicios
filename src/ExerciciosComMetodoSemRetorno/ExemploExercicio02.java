package ExerciciosComMetodoSemRetorno;

public class ExemploExercicio02 {
    public static void main(String[] args) {
        String status = verificarAprovacao();
        System.out.println(status);
        String statusFaltas = verificarFaltas();
        System.out.println(statusFaltas);
        String statusCancela = verificarCanceladas();
        System.out.println(statusCancela);
        String statusAltura = verificarAltura();
        System.out.println(statusAltura);
        String statusPeso = verificarPeso();
        System.out.println(statusPeso
        );
    }
    public static String verificarAprovacao() {
        int nota = 10;
        if (nota >= 5) {
            return "Aprova" + (nota);
        }
        else{
            return "Reprovado";
        }
    }
    public static String verificarFaltas() {
        int falta = 10;
        if (falta >= 5) {
            return "Aprova" + (falta);
        }
        else{
            return "Reprovado";
        }
    }
    public static String verificarCanceladas() {
        int Cancelado = 10;
        if (Cancelado >= 5) {
            return "Cancelado" + (Cancelado);
        }
        else{
            return "Moral em dia";
        }
    }
    public static String verificarAltura() {
        int altura = 175;
        if (altura >= 175) {
            return "Alto" + (altura);
        }
        else{
            return "Baixo";
        }
    }
    public static String verificarPeso() {
        int peso = 175;
        if (peso >= 175) {
            return "Acima do peso" + (peso);
        }
        else{
            return "Abaixo do peso";
        }
    }
}

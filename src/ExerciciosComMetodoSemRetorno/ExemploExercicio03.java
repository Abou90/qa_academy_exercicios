package ExerciciosComMetodoSemRetorno;

public class ExemploExercicio03 {
    public static void main(String[] args) {
        exemploMetodoComParametroSemRetorno("Teste 1", "Teste 2");
        System.out.println(exemploMetodoComParametroComRetorno("Com Retorno 1", "Com Retorno 2"));
        exemplo2MetodoComParametroSemRetorno("2Teste 1", "2Teste 2");
        System.out.println(exemplo2MetodoComParametroComRetorno("2Com Retorno 1", "2Com Retorno 2"));
        exemplo3MetodoComParametroSemRetorno("3Teste 1", "3Teste 2");
        System.out.println(exemplo3MetodoComParametroComRetorno("3Com Retorno 1", "3Com Retorno 2"));
        exemplo4MetodoComParametroSemRetorno("4Teste 1", "4Teste 2");
        System.out.println(exemplo4MetodoComParametroComRetorno("4Com Retorno 1", "4Com Retorno 2"));
        exemplo5MetodoComParametroSemRetorno("5Teste 1", "5Teste 2");
        System.out.println(exemplo5MetodoComParametroComRetorno("5Com Retorno 1", "5Com Retorno 2"));
    }
    public static void exemploMetodoComParametroSemRetorno(String palavraUm, String palavraDois){
        System.out.println(palavraUm);
        System.out.println(palavraDois);
    }
    public static String exemploMetodoComParametroComRetorno(String palavraUm, String palavraDois){
        String palavras = palavraDois + palavraUm;
        return palavras;
    }
    public static void exemplo2MetodoComParametroSemRetorno(String palavraUm, String palavraDois){
        System.out.println(palavraUm);
        System.out.println(palavraDois);
    }
    public static String exemplo2MetodoComParametroComRetorno(String palavraUm, String palavraDois){
        String palavras = palavraDois + palavraUm;
        return palavras;
    }
    public static void exemplo3MetodoComParametroSemRetorno(String palavraUm, String palavraDois){
        System.out.println(palavraUm);
        System.out.println(palavraDois);
    }
    public static String exemplo3MetodoComParametroComRetorno(String palavraUm, String palavraDois){
        String palavras = palavraDois + palavraUm;
        return palavras;
    }
    public static void exemplo4MetodoComParametroSemRetorno(String palavraUm, String palavraDois){
        System.out.println(palavraUm);
        System.out.println(palavraDois);
    }
    public static String exemplo4MetodoComParametroComRetorno(String palavraUm, String palavraDois){
        String palavras = palavraDois + palavraUm;
        return palavras;
    }
    public static void exemplo5MetodoComParametroSemRetorno(String palavraUm, String palavraDois){
        System.out.println(palavraUm);
        System.out.println(palavraDois);
    }
    public static String exemplo5MetodoComParametroComRetorno(String palavraUm, String palavraDois){
        String palavras = palavraDois + palavraUm;
        return palavras;
    }

}

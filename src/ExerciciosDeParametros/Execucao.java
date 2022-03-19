package ExerciciosDeParametros;

public class Execucao {
    public static void main(String[] args) {
        Parametros exParametr = new Parametros();
        exParametr.exemploMetodoComParametroSemRetorno("1 - teste1", "1 - teste2");
        exParametr.exemploMetodoComParametroComRetorno("Retorno1 - teste1", "Retorno1 - teste2");
        exParametr.exemplo2MetodoComParametroComRetorno("Retorno2 - teste1", "Retorno2 - teste2");
        exParametr.exemplo2MetodoComParametroSemRetorno("2 - teste1", "2 - teste2");
        exParametr.exemplo3MetodoComParametroComRetorno("Retorno3 - teste1", "Retorno3 - teste2");
        exParametr.exemplo3MetodoComParametroSemRetorno("3 - teste1", "3 - teste2");
        exParametr.exemplo4MetodoComParametroComRetorno("Retorno4 - teste1", "Retorno4 - teste2");
        exParametr.exemplo4MetodoComParametroSemRetorno("4 - teste1", "4 - teste2");
        exParametr.exemplo5MetodoComParametroComRetorno("Retorno5 - teste1", "Retorno5 - teste2");
        exParametr.exemplo5MetodoComParametroSemRetorno("5 - teste1", "5 - teste2");
    }
}

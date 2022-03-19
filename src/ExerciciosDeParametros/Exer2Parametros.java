package ExerciciosDeParametros;

public class Exer2Parametros {
    public static String CelularComRetorno(String celularUm, String celularDois) {
        String celulares = celularDois + celularUm;
        return celulares;
    }

    public static void CelularSemRetorno(String celularUm, String celularDois) {
        System.out.println(celularUm);
        System.out.println(celularDois);
    }
}

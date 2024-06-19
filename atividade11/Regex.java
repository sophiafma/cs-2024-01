package atividade11;
import java.util.regex.Matcher;

public class Regex { 
 
    public static void main(String[] args) {
        System.out.println(" Teste de login: ");
        System.out.println("Apenas letras: " + validarLogin("sophia"));
        System.out.println("Apenas numeros: " + validarLogin("0000000"));
        System.out.println("Apenas caracteres especiais: " + validarLogin("******"));
        System.out.println("Menor que 5 caracteres: " + validarLogin("sop*"));
        System.out.println("Maior que 30 caracteres: " + validarLogin("123456****sophia123456****sophia***"));
        System.out.println("Login valido: " + validarLogin("sophia*123"));

        System.out.println("");

        System.out.println("Teste de senha: ");
        System.out.println("Apenas letras: " + validarSenha("sophia"));
        System.out.println("Apenas numeros: " + validarSenha("0000000"));
        System.out.println("Apenas caracteres especiais: " + validarSenha("******"));
        System.out.println("Menor que 8 caracteres: " + validarSenha("sop*"));
        System.out.println("Maior que 12 caracteres: " + validarSenha("*sophia123456***"));
        System.out.println("Senha valida: " + validarSenha("Sophia*123"));

    }

    private static boolean validarLogin(String login) {
        String regex = "^(?=.*\\d)(?=.*[@$%*_?&])[A-Za-z\\d@$%*?&]{5,30}$";

        return login.matches(regex);
    }

 
    private static boolean validarSenha(String senha) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,12}$";

        return senha.matches(regex);
    }
}
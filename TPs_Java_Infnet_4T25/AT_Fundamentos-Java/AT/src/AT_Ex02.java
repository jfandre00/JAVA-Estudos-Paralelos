
import java.util.Scanner;

public class AT_Ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "! Bem-vindo ao sistema de validação de senhas.");
        System.out.println("Entre com a senha:");
        System.out.println("A senha deve conter pelo menos uma LETRA MAIÚSCULA, um NÚMERO e um CARACTERE ESPECIAL (!@#$%^&*()-+)");
        String senha = scanner.nextLine();

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else if ("!@#$%^&*()-+".indexOf(c) >= 0) { // >= 0 significa que o caractere foi encontrado na string
                temEspecial = true;
            }
        }

        if (temMaiuscula && temNumero && temEspecial) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida! Atenda aos requisitos.");
        }

        scanner.close();

    }

}

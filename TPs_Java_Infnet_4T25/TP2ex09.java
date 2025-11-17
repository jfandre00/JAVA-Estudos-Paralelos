package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senhaConfirmacao;
        String senha;

        System.out.println("Digite a senha:");
        senha = entrada.nextLine();

        do {
            System.out.println("Digite novamente a senha para confirmação:");
            senhaConfirmacao = entrada.nextLine();
            if (!senhaConfirmacao.equals(senha)) {
                System.out.println("Senhas não coincidem. Tente novamente.");
            }
        } while (!senhaConfirmacao.equals(senha));
        
        entrada.close();
        System.out.println("Senha confirmada com sucesso!");
    }
}

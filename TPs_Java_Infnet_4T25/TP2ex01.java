package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex01 {

    public static void main(String[] args) {
        String nomeCompleto;
        int idade;
        String nomeDaMae;
        String nomeDoPai;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        nomeCompleto = in.nextLine();
        System.out.println("Digite sua idade:");
        idade = in.nextInt();
        in.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o nome da sua mãe:");
        nomeDaMae = in.nextLine();
        System.out.println("Digite o nome do seu pai:");
        nomeDoPai = in.nextLine();

        int tamanhoNome = nomeCompleto.length();
        int tamanhoNomeMae = nomeDaMae.length();
        int tamanhoNomePai = nomeDoPai.length();

        if (tamanhoNome > tamanhoNomeMae) {
            System.out.println("Seu nome é maior que o nome da sua mãe.");
        }
        if (tamanhoNome > tamanhoNomePai) {
            System.out.println("Seu nome é maior que o nome do seu pai.");
        }
    }
}

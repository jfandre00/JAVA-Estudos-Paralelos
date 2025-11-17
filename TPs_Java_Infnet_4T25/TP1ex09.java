package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP1ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome:");
        nome = in.nextLine();
        System.out.println("Digite sua idade:");
        idade = in.nextInt();
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

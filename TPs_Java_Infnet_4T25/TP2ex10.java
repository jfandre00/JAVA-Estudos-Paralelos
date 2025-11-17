package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex10 {
    public static void main(String[] args) {
        
        int numeroAleatorio = (int) (Math.random() * 100) + 1; // entre 1 e 100
        int tentativas = 0;
        int palpites = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        do {
            System.out.println("Digite seu palpite (1-100):");
            palpites = entrada.nextInt();
            tentativas++;

            if (palpites < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpites > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        } while (palpites != numeroAleatorio);

        entrada.close();
    }
    
}

import java.util.Random;
import java.util.Scanner;

public class AT_Ex11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[] sorteio = new int[6];
        int[] aposta = new int[6];

        // -------------------------------------
        // 1) GERAR 6 NÚMEROS SEM REPETIR
        // -------------------------------------
        for (int i = 0; i < 6; i++) {
            int num = rd.nextInt(60) + 1;

            // verifica repetição 
            for (int j = 0; j < i; j++) {
                if (sorteio[j] == num) { // repetiu 
                    num = rd.nextInt(60) + 1; // gera outro número
                    j = -1; // volta ao começo da sequencia para revalidar tudo
                }
            }
            sorteio[i] = num;
        }

        /*
        // mostrar números sorteados (debug)
        
        System.out.print("Sorteados: ");
        for (int n : sorteio) {
            System.out.print(n + " ");
        }
        System.out.println();
        */

        // -------------------------------------
        // 2) RECEBER 6 NÚMEROS DO USUÁRIO
        // -------------------------------------
        System.out.println("Digite 6 números entre 1 e 60:");

        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();

            // validação simples
            if (n < 1 || n > 60) {
                System.out.println("Inválido! Digite novamente:");
                i--; 
            } else {
                aposta[i] = n;
            }
        }

        // -------------------------------------
        // 3) CONTAR ACERTOS
        // -------------------------------------
        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (aposta[i] == sorteio[j]) {
                    acertos++;
                }
            }
        }

        // -------------------------------------
        // 4) RESULTADOS
        // -------------------------------------
        System.out.print("Sorteio: ");
        for (int n : sorteio) {
            System.out.print(n + " ");
        }

        System.out.print("\nAposta:  ");
        for (int n : aposta) {
            System.out.print(n + " ");
        }

        System.out.println("\nAcertos: " + acertos);

        sc.close();
    }
}


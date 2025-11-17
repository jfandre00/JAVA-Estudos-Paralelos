package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char opcao;
        double valorReais;
        System.out.println("Digite um valor em reais:");
        valorReais = in.nextDouble();
        System.out.println("Escolha a moeda para conversão (D - Dólar, E - Euro, L - Libra):");
        opcao = in.next().toUpperCase().charAt(0);

        // constante para as taxas de câmbio
        final double TAXA_DOLAR = 5.0;
        final double TAXA_EURO = 6.0;
        final double TAXA_LIBRA = 7.0;

        switch(opcao) {
            case 'D':
                System.out.printf("Valor em Dólares: %.2f\n", valorReais / TAXA_DOLAR);
                break;
            case 'E':
                System.out.printf("Valor em Euros: %.2f\n", valorReais / TAXA_EURO);
                break;
            case 'L':
                System.out.printf("Valor em Libras: %.2f\n", valorReais / TAXA_LIBRA);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        in.close();

        
    }
    
}

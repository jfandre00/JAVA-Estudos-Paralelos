package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public interface TP2ex02 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = in.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = in.nextDouble();
        System.out.println("Digite a quarta nota:");
        nota4 = in.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        
    }
}

package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex08 {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do lado 1:");
        lado1 = entrada.nextInt();

        System.out.println("Digite o comprimento do lado 2:");
        lado2 = entrada.nextInt();

        System.out.println("Digite o comprimento do lado 3:");
        lado3 = entrada.nextInt();

        entrada.close();

        // verificar se forma um triângulo
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("Os lados fornecidos não formam um triângulo.");
            return;
        }
        // determinar o tipo de triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }
        
    }
}
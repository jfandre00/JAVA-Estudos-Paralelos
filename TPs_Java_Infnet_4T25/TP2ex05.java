package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex05 {
    public static void main(String[] args) {
        
        double valorCompra;
        int desconto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = entrada.nextDouble();

        if (valorCompra < 500) {
            desconto = 0;
        } else if (valorCompra >= 500 && valorCompra < 1000) {
            desconto = 5;
        } else {
            desconto = 10;
        }

        double precoFinal = valorCompra - (valorCompra * desconto / 100);
        System.out.println("Preço final: R$ " + String.format("%.2f", precoFinal));
    }
}

package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ano;
        System.out.println("Digite um ano:");
        ano = in.nextInt();
        in.close();

        boolean bissexto;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        } else {
            bissexto = false;
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }

}

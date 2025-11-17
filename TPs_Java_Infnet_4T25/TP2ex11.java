package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex11 {
    public static void main(String[] args) {
        int incremento;
        int valor = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor inicial:");
        valor = entrada.nextInt();
        System.out.println("Digite o incremento:");
        incremento = entrada.nextInt();
        entrada.close();

        System.out.println("Sequência:");
        do { 
            System.out.println(valor);
            valor += incremento;
            if (valor > 100) {
                System.out.println(valor); // imprime o valor até ultrapassar 100
                break;
            }
        } while (true);
    }
}

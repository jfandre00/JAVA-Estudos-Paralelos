
import java.util.Scanner;

public class AT_Ex03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "! Bem-vindo ao sistema de cálculo de imposto de renda.");
        System.out.println("Entre com a o seu salário mensal:");
        double salario = scanner.nextDouble();

        double salarioAnual = salario * 12;

        double imposto;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        if (imposto == 0) {
            System.out.println("Você está isento de pagar imposto de renda.");
            System.out.println("Seu salário líquido anual é: R$ " + salarioAnual);
        } else {
            System.out.printf("O imposto de renda anual devido é: R$ %.2f%n", imposto);
            double salarioLiquidoAnual = salarioAnual - imposto;
            System.out.printf("Seu salário líquido anual é: R$ %.2f%n", salarioLiquidoAnual);
            System.out.printf("Seu salário líquido mensal é: R$ %.2f%n", salarioLiquidoAnual / 12);
        }

        scanner.close();

    }

}


import java.util.Scanner;

public class AT_Ex04 {

    public static void main(String[] args) {

        final double TAXA_JUROS_MENSAL = 0.03; // 3% de juros ao mês

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "! Bem-vindo ao sistema de empréstimo bancário.");
        System.out.println("Entre com a o valor do empréstimo desejado:");
        double emprestimo = scanner.nextDouble();
        System.out.println("Entre com a o número de parcelas (minimo 6, máximo 48):");
        int parcelas = scanner.nextInt();
        if (parcelas < 6 || parcelas > 48) {
            System.out.println("Número de parcelas inválido! Deve ser entre 6 e 48.");
            scanner.close();
            return;
        }

        double valorTotalPago;
        double valorParcelaMensal;

        valorTotalPago = emprestimo * Math.pow(1 + TAXA_JUROS_MENSAL, parcelas);
        valorParcelaMensal = valorTotalPago / parcelas;

        System.out.printf("O valor total a ser pago ao final do empréstimo é: R$ %.2f%n", valorTotalPago);
        System.out.printf("O valor de cada parcela mensal é: R$ %.2f%n", valorParcelaMensal);   




        

        scanner.close();

    }

}

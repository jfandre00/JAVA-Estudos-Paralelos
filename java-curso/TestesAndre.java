import java.util.Scanner;

public class TestesAndre {
    public static void main(String[] args) {
        // pegar uma string que vem do console
        //String entrada = "10 20 30 40 50";
        // pegar uma string que vem do input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String entrada = scanner.nextLine();
 
        // separar os números
        String[] numeros = entrada.split(" ");
        // criou um vetor de inteiros vazio, com o mesmo tamanho do vetor de String números
        int[] inteiros = new int[numeros.length];
        // converter os números para inteiros
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = Integer.parseInt(numeros[i]);
        }
        // somar os números
        int soma = 0;
        for (int i = 0; i < inteiros.length; i++) {
            soma += inteiros[i];
        }
        // imprimir a soma
        System.out.println("A soma dos números é: " + soma);

                
    }
}

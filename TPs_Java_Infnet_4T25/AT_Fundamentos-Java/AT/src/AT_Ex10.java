import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AT_Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arquivo onde iremos salvar as compras
        String arquivo = "compras.txt";

        try {
            // FileWriter (no modo "append = false") sobrescreve o arquivo
            FileWriter fw = new FileWriter(arquivo, false);

            System.out.println("=== Cadastro de Compras ===");

            // Vamos cadastrar 3 compras
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nCompra " + i + ":");

                System.out.print("Produto: ");
                String produto = sc.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(sc.nextLine());

                System.out.print("Preço unitário: ");
                double preco = Double.parseDouble(sc.nextLine());

                // Salvando no arquivo (uma compra por linha)
                fw.write(produto + ";" + quantidade + ";" + preco + "\n");
            }

            fw.close();  // Fecha o arquivo depois de escrever

            System.out.println("\nCompras salvas com sucesso!\n");

            // Agora vamos ler o arquivo
            System.out.println("=== Compras Registradas ===");

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            // Lê cada linha do arquivo até não haver mais linhas
            while ((linha = br.readLine()) != null) {
                // Cada linha está no formato: produto;quantidade;preco
                String[] partes = linha.split(";");

                String produto = partes[0];
                int quantidade = Integer.parseInt(partes[1]);
                double preco = Double.parseDouble(partes[2]);

                System.out.println("Produto: " + produto +
                                   " | Quantidade: " + quantidade +
                                   " | Preço unitário: " + preco);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}

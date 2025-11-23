
public class App {

    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();

        produto1.setNome("Notebook");
        produto1.setPreco(3500.00);
        produto1.setQuantidadeEmEstoque(15);

        produto1.ExibirInformacoes();
        produto1.alterarPreco(3200.00);
        produto1.alterarQuantidade(10);
        produto1.ExibirInformacoes();

        // Mostrando os getters 
        System.out.println("Nome via getter: " + produto1.getNome());
        System.out.println("Preço via getter: " + produto1.getPreco());
        System.out.println("Quantidade em estoque via getter: " + produto1.getQuantidadeEmEstoque());

        // Usando o construtor
        Produto produto2 = new Produto("Smartphone", 1500.00, 30);
        produto2.ExibirInformacoes();

        // Quebra de linha para melhor visualização
        System.out.println();
        System.out.println("--- Testando a classe Conta ---");
        System.out.println();

        Conta conta1 = new Conta();
        conta1.titular = "João Silva";
        conta1.numero = 12345;
        conta1.agencia = "Vila Nova";
        conta1.saldo = 1000.00;
        conta1.dataAbertura = "01/01/2023";

        conta1.saca(500);
        conta1.deposita(200);
        conta1.calculaRendimento();

        System.out.println("Informações da Conta:");
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Número: " + conta1.numero);
        System.out.println("Agência: " + conta1.agencia);
        System.out.println("Saldo: " + conta1.saldo);
        System.out.println("Data de Abertura: " + conta1.dataAbertura);
        

    }
}

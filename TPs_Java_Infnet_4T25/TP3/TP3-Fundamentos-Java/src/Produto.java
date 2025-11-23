public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto() {
        // Construtor padrão
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }



    // Métodos para alterar preço e quantidade
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Preço alterado para: " + novoPreco);
    }
   
    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
        System.out.println("Quantidade em estoque alterada para: " + novaQuantidade);
    }

    public void ExibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }



    
}

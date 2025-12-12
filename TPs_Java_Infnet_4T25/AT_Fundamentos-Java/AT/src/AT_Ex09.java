
public class AT_Ex09 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João Silva");
        conta.depositar(1000);
        conta.exibirSaldo();
        conta.sacar(250);
        conta.exibirSaldo();
        conta.sacar(2000); // Tentativa de saque maior que o saldo
        
        


    }

}

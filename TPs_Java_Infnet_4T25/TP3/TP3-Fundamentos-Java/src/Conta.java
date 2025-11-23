
public class Conta {

    public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    public String dataAbertura;

    // Métodos solicitados ex08
    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ".");
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido: " + valor + ".");
        }
    }

    public void calculaRendimento() {
        double rendimento = saldo * 0.1; // Rendimento de 10%
        System.out.println("Rendimento calculado: " + rendimento);
    }

}

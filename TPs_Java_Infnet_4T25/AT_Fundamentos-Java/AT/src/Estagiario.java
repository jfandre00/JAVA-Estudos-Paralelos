
public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase * 0.9);
        // Estagiário recebe um desconto de 10% sobre o salário base
    }

}

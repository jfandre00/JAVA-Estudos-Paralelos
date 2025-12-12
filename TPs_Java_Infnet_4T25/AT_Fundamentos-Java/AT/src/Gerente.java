
public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase * 1.2);
        // Gerente recebe um bônus de 20% sobre o salário base
    }

}

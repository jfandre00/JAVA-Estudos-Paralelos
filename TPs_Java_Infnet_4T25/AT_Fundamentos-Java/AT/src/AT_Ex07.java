
public class AT_Ex07 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("2023001", "João Silva", 8.5, 7.0, 9.0);
        Aluno aluno2 = new Aluno("2023002", "Maria Oliveira", 6.0, 5.5, 6.5);

        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }

}

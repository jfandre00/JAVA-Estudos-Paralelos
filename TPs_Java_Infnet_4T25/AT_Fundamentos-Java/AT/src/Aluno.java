
public class Aluno {

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String matricula, String nome, double nota1, double nota2, double nota3) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        // retornar a média arredondada com duas casas decimais
        return Math.round(((nota1 + nota2 + nota3) / 3) * 100.0) / 100.0;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aluno " + nome + " (Matrícula: " + matricula + ") está aprovado com média: " + media);
        } else {
            System.out.println("Aluno " + nome + " (Matrícula: " + matricula + ") está reprovado com média: " + media);
        }
    }
}

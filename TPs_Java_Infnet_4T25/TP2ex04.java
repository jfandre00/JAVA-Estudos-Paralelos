package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex04 {
    public static void main(String[] args) {
        
        java.time.LocalDateTime agora = java.time.LocalDateTime.now();

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento (DD-MM-AAAA):");
        String dataNascimentoStr = in.nextLine();
        in.close();
        
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        java.time.LocalDate dataNascimento = java.time.LocalDate.parse(dataNascimentoStr, formatter);
        java.time.Period idade = java.time.Period.between(dataNascimento, agora.toLocalDate());
        System.out.println("Idade: " + idade.getYears() + " anos, " + idade.getMonths() + " meses e " + idade.getDays() + " dias.");

        // somente a idade em dias
        long idadeEmDias = java.time.temporal.ChronoUnit.DAYS.between(dataNascimento, agora.toLocalDate());
        System.out.println("Idade em dias: " + idadeEmDias + " dias.");

    }
}

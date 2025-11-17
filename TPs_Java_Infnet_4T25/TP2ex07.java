package TPs_Java_Infnet_4T25;

import java.util.Scanner;

public class TP2ex07 {
    public static void main(String[] args) {
    
        double salarioBrutoAnual;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário bruto anual:");
        salarioBrutoAnual = entrada.nextDouble();

        entrada.close();

        // ALÍQUOTAS DE IMPOSTO DE RENDA (2024 - Brasil)

        double imposto;
        if (salarioBrutoAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioBrutoAnual <= 33919.80) {
            imposto = salarioBrutoAnual * 0.075;
        } else if (salarioBrutoAnual <= 45012.60) {
            imposto = salarioBrutoAnual * 0.15;
        } else if (salarioBrutoAnual <= 55976.16) {
            imposto = salarioBrutoAnual * 0.225;
        } else {
            imposto = salarioBrutoAnual * 0.275;
        }

        System.out.println("Imposto de Renda devido: R$ " + String.format("%.2f", imposto));


    
    }
    
}

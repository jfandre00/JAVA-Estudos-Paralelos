package TPs_Java_Infnet_4T25;

public class TP2ex12 {
    public static void main(String[] args) {
     
        
        String frase = "Esta é uma frase de exemplo para contar palavras";
        String[] palavras = frase.split(" ");
        int contador = 0;
        for (String palavra : palavras) {
            contador++;
        }
        System.out.println("Total de palavras: " + contador);
    }
    
}

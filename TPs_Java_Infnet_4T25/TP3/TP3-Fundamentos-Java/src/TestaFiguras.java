
// classe main executável para testar as classes Circulo e Esfera
public class TestaFiguras {

    public static void main(String[] args) {
        // Testando a classe Circulo
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;
        double areaCirculo = circulo.calcularArea();
        // Arredondar para duas casas decimais
        areaCirculo = Math.round(areaCirculo * 100.0) / 100.0;
        System.out.println("Área do Círculo com raio " + circulo.raio + " é: " + areaCirculo + "cm²");

        // Testando a classe Esfera
        Esfera esfera = new Esfera();
        esfera.raio = 5.0;
        double volumeEsfera = esfera.calcularVolume();
        // Arredondar para duas casas decimais
        volumeEsfera = Math.round(volumeEsfera * 100.0) / 100.0;
        System.out.println("Volume da Esfera com raio " + esfera.raio + " é: " + volumeEsfera + "cm³");
    }
}

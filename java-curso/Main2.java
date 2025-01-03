public class Main2 {

    public static void test() {
        System.out.println("Teste");
    }

    public static void main(String[] args) { // Representa um método que vai ser acionado quando o programa for executado. Método de entrada do programa
        
        Carro meuCarro = new Carro("Fusca"); // Nova instância da classe Carro
        Carro meuOutroCarro = new Carro("BMW"); // Nova instância da classe Carro

        String result1 = meuCarro.acelerar();
        meuOutroCarro.acelerar();

        System.out.println(result1);
    }
    
}

class Carro {
    String modelo;

    public Carro(String modelo) {
        System.out.println("Criando um carro com modelo " + modelo);
        this.modelo = modelo;
    }

    public String acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
        return "oi";
    }

    public String test() {
        System.out.println("Teste esse método será executado somente se for chamado" + this.modelo);
        return "oi";
    }

}
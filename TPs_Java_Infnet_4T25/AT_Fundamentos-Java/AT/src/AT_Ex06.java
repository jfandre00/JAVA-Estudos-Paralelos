
public class AT_Ex06 {

    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        carro.setPlaca("ABC-1234");
        carro.setModelo("Toyota Corolla");
        carro.setAnoFabricacao(2020);
        carro.setQuilometragem(15000.0);
        carro.exbirDetalhes();
        carro.registrarViagem(250.5);
    }

}

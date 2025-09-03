public class Carro extends Veiculo {

    private int quantidadePortas;
    private static final double TAXA_LIMPEZA = 50.00;

    public Carro(String marca, String modelo, int ano, double valorDiaria, String placa, int quantidadePortas) {
        super(marca, modelo, ano, valorDiaria, placa);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) + TAXA_LIMPEZA;
    }
}
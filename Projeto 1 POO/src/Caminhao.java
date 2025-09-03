class Caminhao extends Veiculo{

    private double capacidadeCarga;
    private static final double TAXA_MANUTENCAO = 200.00;

    public Caminhao(String marca, String modelo, int ano, double valorDiaria, String placa, double capacidadeCarga) {
        super(marca,modelo, ano, valorDiaria, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) + TAXA_MANUTENCAO;
    }
}

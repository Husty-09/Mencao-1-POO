class Moto extends Veiculo {

    private int cilindrada;
    private static final double DESCONTO = 0.05;

    public Moto(String marca, String modelo, int ano, double valorDiaria, String placa, int cilindrada) {
    super(marca, modelo, ano, valorDiaria, placa);
    this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorBruto = getValorDiaria() * dias;
        return valorBruto - (valorBruto * DESCONTO);
    }
}

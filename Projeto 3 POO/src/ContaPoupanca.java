class ContaPoupanca extends Conta {

    private int aniversarioConta;
    private static final double RENDIMENTO = 0.02;

    public ContaPoupanca(String numero, String titular, String agencia, double saldo, int aniversarioConta) {
        super (numero,titular,agencia, saldo);
        this.aniversarioConta = aniversarioConta;
    }

    private int getAniversarioConta() {
        return aniversarioConta;
    }

    @Override
    public double calcularSaldoFinal() {
        return getSaldo() * (1 + RENDIMENTO);
    }
}

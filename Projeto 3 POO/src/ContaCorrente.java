class ContaCorrente extends Conta {

    private double limiteChequeEspecial;
    private static final double TAXA_FIXA = 15.00;

    public ContaCorrente(String numero, String titular, String agencia, double saldo, double limiteChequeEspecial) {
        super (numero, titular, agencia, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public double calcularSaldoFinal() {
        return getSaldo() - TAXA_FIXA;
    }
}

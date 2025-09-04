class ContaSalario extends Conta{
    private String empresaConveniada;
    private static double LIMITE_SAQUE = 1000.00;

    public ContaSalario (String numero, String titular, String agencia, double salario, String empresaConveniada) {
        super (numero, titular, agencia, salario);
        this.empresaConveniada = empresaConveniada;
    }

    public String getEmpresaConveniada() {
    return empresaConveniada;
    }

    @Override
    public void sacar (double valor) {
        if (valor > 0 && valor <= LIMITE_SAQUE && getSaldo() >= valor) {
            super.sacar (valor);
        }
        else {
            System.out.println("Saque não permitido:\nO valor exede o limite de R$ 1000.00 ou seu saldo é insuficiente.");
        }
    }

    @Override
    public double calcularSaldoFinal() {
        return getSaldo();
    }
}
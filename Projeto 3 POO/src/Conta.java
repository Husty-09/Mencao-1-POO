public abstract class Conta {

    private String numero;
    private String titular;
    private String agencia;
    private double saldo;

    public Conta(String numero, String titular, String agencia, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque iválido.");
        }
    }

    public abstract double calcularSaldoFinal();
}
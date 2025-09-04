import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        List<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente("12345-6", "Ana Silva", "001", 1500.00, 1000.00));
        contas.add(new ContaPoupanca("65432-1", "Bruno Costa", "002", 600.00, 15));
        contas.add(new ContaSalario("09876-1", "Carlos Santos", "003", 3400.00, "Microsoft"));

        System.out.println("\n---Operações e Saldos das Contas ---");
        System.out.println("------------------------------------");

        for (Conta conta: contas) {
            System.out.println("\nConta: " + conta.getNumero() + " - Titular: " + conta.getTitular() + " - Agência: " + conta.getAgencia());
            System.out.println("\nSaldo inicial: R$" + conta.getSaldo());

            if (conta instanceof ContaCorrente) {
                conta.depositar(200.00);
                conta.sacar(150.00);
            }
            else if (conta instanceof ContaPoupanca) {
                conta.depositar(100.00);
                conta.sacar(50.00);
            }
            else if (conta instanceof ContaSalario) {
                conta.depositar(300.00);
                conta.sacar(1200.00);
                conta.sacar(500.00);
            }

            Locale localeUS = new Locale("en", "US");
            System.out.printf(localeUS, "Saldo final calculado: R$%.2f%n", conta.calcularSaldoFinal());
            System.out.println("-----------------------------------------");
        }
    }
}

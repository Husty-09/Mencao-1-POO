import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", "Corolla", 2023, 150.0, "ABC1234", 4));
        veiculos.add(new Moto("Honda", "CB 500F", 2022, 80.0, "DEF5678", 500));
        veiculos.add(new Caminhao("Volvo", "FH 540", 2021, 500.0, "GHI9012", 15.5));

        int diasAluguel = 7;

        System.out.println("\n--- Aluguel de Veículos por " + diasAluguel + " dias ---");
        for (Veiculo veiculo : veiculos) {
            System.out.println("\nModelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.printf("Valor do Aluguel: R$ %.2f%n", veiculo.calcularAluguel(diasAluguel));
            System.out.println("--------------------");
        }
    }
}
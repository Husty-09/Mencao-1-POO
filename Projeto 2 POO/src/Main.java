import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Buddy", 5, 12.5, "Canil", "Golden Retrivier"));
        animais.add(new Gato("Garfield", 3, 8.0, "Gatil", "Laranja e preto"));
        animais.add(new Leao("Simba", 12, 180, "Savana", 0.5));

        System.out.println("\n--- Zoológico - Informações dos Animais ---");
        for (Animal animal : animais) {
            System.out.println("\nNome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Som que emite: " + animal.emitirSom());
            System.out.println("Alimentação: " + animal.alimentar());
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.println("Raça: " + cachorro.getRaca());
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                System.out.println("Cor: " + gato.getCor());
            } else if (animal instanceof Leao) {
                Leao leao = (Leao) animal;
                System.out.println("Tamanho da Juba: " + leao.getTamanhoJuba() + "m");
            }
                System.out.println("------------------------------------------");
        }
    }
}
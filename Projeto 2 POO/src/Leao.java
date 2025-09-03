public class Leao extends Animal{

    private double tamanhoJuba;

    public Leao (String nome, int idade, double peso, String habitat, double tamahoJuba){
        super(nome, idade, peso, habitat);
        this.tamanhoJuba =tamahoJuba;
    }

    public double getTamanhoJuba() {
        return tamanhoJuba;
    }

    @Override
    public String emitirSom() {
        return "Rugido";
    }

    @Override
    public String alimentar() {
        return "Carne";
    }
}


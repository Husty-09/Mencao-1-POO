public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, double peso, String habitat, String raca) {
        super(nome, idade, peso, habitat);
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }

    @Override
    public String emitirSom() {
        return "Latido";
    }
    @Override
    public String alimentar() {
        return "ração";
    }
}

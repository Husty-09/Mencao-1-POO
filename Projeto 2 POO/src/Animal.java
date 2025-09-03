public abstract class Animal {

    public abstract String emitirSom();
    public abstract String alimentar();

    private String nome;
    private int idade;
    private double peso;
    private String habitat;

    public Animal( String nome, int idade, double peso, String habitat){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
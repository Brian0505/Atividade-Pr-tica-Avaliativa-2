public class Animal {
    private String nome;
    private int idade;
    private float peso;
    private String tipo;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Animal() {
    }

    public Animal(String nome, int idade, float peso, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", tipo=" + tipo + "]";
    }
}
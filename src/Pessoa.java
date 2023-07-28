public class Pessoa {
    private String nome;
    private int idade;
    private String morada;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String morada) {
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
    }

    public String getNome() {return nome;}

    public int getIdade() {return idade;}

    public String getMorada() {return morada;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return
                "[ Nome: " + nome +'\'' +
                ", Idade: " + idade +
                ", Morada: " + morada + '\'';
    }
}

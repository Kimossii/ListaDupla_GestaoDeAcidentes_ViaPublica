public class Vitima extends Pessoa{
    private String gravidade_de_lesoes;


    public Vitima(String nome, int idade, String morada, String gravidade_de_lesoes) {
        super(nome, idade, morada);
        this.gravidade_de_lesoes = gravidade_de_lesoes;
    }

    public String getGravidade_de_lesoes() {return gravidade_de_lesoes;}

    public void setGravidade_de_lesoes(String gravidade_de_lesoes) {this.gravidade_de_lesoes = gravidade_de_lesoes;}

    @Override
    public String toString() {
        return " \nDados da Vitima " +
                super.toString()+" Gravidade de Lesão: '" + gravidade_de_lesoes + '\''+"]";
    }
}

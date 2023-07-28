public class Condutor extends Pessoa{
    private String numero_carta;
    private float valorPerda;

    public Condutor(String nome, int idade, String morada, String numero_carta, float valorPerda) {
        super(nome, idade, morada);
        this.numero_carta = numero_carta;
        this.valorPerda = valorPerda;
    }

    public String getNumero_carta() {return numero_carta;}

    public float getValorPerda() {return valorPerda;}

    public void setNumero_carta(String numero_carta) {this.numero_carta = numero_carta;}

    public void setValorPerda(float valorPerda) {this.valorPerda = valorPerda;}

    @Override
    public String toString() {
        return " \n Dados do Condutor " +super.toString()+
                "Número de carta='" + numero_carta + '\'' +" Valor de Perda: "+ valorPerda+
                ']';
    }
}

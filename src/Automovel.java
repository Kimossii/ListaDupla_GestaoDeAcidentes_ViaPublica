public class Automovel{
    private String numero_matricula;
    private String amarca_carro;
    private String acor_carro;

    public Automovel(String numero_matricula, String amarca_carro, String acor_carro) {
        this.numero_matricula = numero_matricula;
        this.amarca_carro = amarca_carro;
        this.acor_carro = acor_carro;
    }

    public String getNumero_matricula() {return numero_matricula;}

    public String getAmarca_carro() {return amarca_carro;}

    public String getAcor_carro() {return acor_carro;}

    public void setNumero_matricula(String numero_matricula) {this.numero_matricula = numero_matricula;}

    public void setAmarca_carro(String amarca_carro) {this.amarca_carro = amarca_carro;}

    public void setAcor_carro(String acor_carro) {this.acor_carro = acor_carro;}

    @Override
    public String toString() {
        return " \n Dados de Automovel [" +
                "Matrícula: " + numero_matricula + '\'' +
                ", Amarca: " + amarca_carro + '\'' +
                ", Acor: " + acor_carro + '\'';
    }
}

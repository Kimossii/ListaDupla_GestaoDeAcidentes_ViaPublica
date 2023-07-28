public class Registrar_Atropelamento {
    private Condutor condutor;
    private Vitima vitima;
    private Automovel automovel;
    private boolean acidedentes_graves;

    public Registrar_Atropelamento(Condutor condutor, Vitima vitima,Automovel automovel) {
        this.condutor = condutor;
        this.vitima = vitima;
        this.automovel = automovel;
    }

    public Registrar_Atropelamento(Condutor condutor, Vitima vitima,Automovel automovel, boolean acidedentes_graves) {
        this.condutor = condutor;
        this.vitima = vitima;
        this.automovel = automovel;
        this.acidedentes_graves = acidedentes_graves;
    }


    public Condutor getContudor() {return condutor;}

    public Vitima getVitima() {return vitima;}

    public Automovel getAutomovel() {return automovel;}


    public boolean isAcidedentes_graves() {return acidedentes_graves;}

    public void setContudor(Condutor contudor) {this.condutor = condutor;}

    public void setVitima(Vitima vitima) {this.vitima = vitima;}

    public void setAutomovel(Automovel automovel) {this.automovel = automovel;}

    public void setAcidedentes_graves(boolean acidedentes_graves) {this.acidedentes_graves = acidedentes_graves;}

    @Override
    public String toString() {
        return  " "+vitima+" "+condutor +
                  " "+automovel+
                ']'+"\n";
    }
}

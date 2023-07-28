public class Elemento {
    public Registrar_Atropelamento registrar_atropelamento;
    public  Elemento proximo;
    public Elemento anterior;

    public Elemento() {
    }

    public Elemento(Registrar_Atropelamento registrar_atropelamento) {
        this.registrar_atropelamento = registrar_atropelamento;
    }

    public Registrar_Atropelamento getRegistrar_atropelamento() {
        return registrar_atropelamento;
    }

    /*public void setOcorrenciaPublica(OcorrenciaPublica ocorrenciaPublica) {
        this.ocorrenciaPublica = ocorrenciaPublica;
    }*/
}

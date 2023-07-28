/*Especial são contactos que vão para a linha da frente passando pelos outros contactos*/

import java.nio.FloatBuffer;
import java.util.NoSuchElementException;

public class Acotecimento {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public Acotecimento() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public boolean estaVAzia() {
        return this.primeiro == null;
    }

    public void addUltimo(Registrar_Atropelamento registrar_atropelamento) {
        Elemento novoElemento = new Elemento(registrar_atropelamento);

        if (estaVAzia()) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else if (registrar_atropelamento.isAcidedentes_graves() == true) {
            addInicio(registrar_atropelamento);
        } else {
            this.ultimo.proximo = novoElemento;
            novoElemento.anterior = ultimo;
            this.ultimo = novoElemento;
        }

        this.tamanho += 1;
    }

    public void addInicio(Registrar_Atropelamento registrar_atropelamento) {
         Elemento novoElemento = new Elemento(registrar_atropelamento);

        if (estaVAzia()) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            novoElemento.proximo = this.primeiro;
            this.primeiro.anterior = novoElemento;
            this.primeiro = novoElemento;
        }

        tamanho += 1;
    }

    public void add(int indice, Registrar_Atropelamento registrar_atropelamento) {
        if (indice < 0 || indice > tamanho)
            throw new IndexOutOfBoundsException();

        Elemento novoElemento = new Elemento(registrar_atropelamento);

        if (indice == 0) {
            this.addInicio(registrar_atropelamento);

        } else if (indice == tamanho - 1) {
            this.addUltimo(registrar_atropelamento);

        } else {
            Elemento ou = this.primeiro;

            for (int i = 0; i < indice - 1; i++)
                ou = ou.proximo;

            novoElemento.proximo = ou.proximo;
            ou.proximo = novoElemento;
            novoElemento.proximo.anterior = novoElemento;
            novoElemento.anterior = ou;

            tamanho += 1;
        }
    }

    public Registrar_Atropelamento get(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException();

         Elemento ou = this.primeiro;

        for (int i = 0; i < indice; i++)
            ou = ou.proximo;

        return ou.getRegistrar_atropelamento();
    }


    public int indexOf(String nome) {
        Elemento ou = this.primeiro;
        int indice = 0;
        while (ou != null) {
            if (ou.getRegistrar_atropelamento().getContudor().getNome().equalsIgnoreCase(nome) ||
                    ou.getRegistrar_atropelamento().getVitima().getNome().equalsIgnoreCase(nome))
                return indice;
            ou = ou.proximo;
            indice += 1;
        }

        return -1;
    }

    public boolean contem(String nome) {
        return indexOf(nome) != -1;
    }

    public Registrar_Atropelamento removeInicio() {

        if (estaVAzia()) throw new NoSuchElementException();

        Registrar_Atropelamento registrar_atropelamento = this.primeiro.getRegistrar_atropelamento();

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;
        }

        tamanho -= 1;
        return registrar_atropelamento;
    }

    public Registrar_Atropelamento removeUltimo() {

        if (estaVAzia()) throw new NoSuchElementException();

        Registrar_Atropelamento registrar_atropelamento = this.ultimo.getRegistrar_atropelamento();

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.ultimo = this.ultimo.anterior;
            this.ultimo.proximo = null;
        }

        tamanho -= 1;
        return registrar_atropelamento;

    }
    public float perda(){
        /*float total=0;
        if (tamanho==1){
            total = total + primeiro.getRegistrar_atropelamento().getContudor().getValorPerda();
        }else{
            for (int i=0; i<tamanho; i++){
                total = total +primeiro.proximo.getRegistrar_atropelamento().getContudor().getValorPerda();
            }

        }
    return total;*/
        float v =0;
        float total=0;
        Float sb = null;

        Elemento ocorre = primeiro;
        while (ocorre != null) {
            sb=ocorre.getRegistrar_atropelamento().getContudor().getValorPerda();
             total = sb;
            ocorre = ocorre.proximo;
             v+=total;
        }

        return v;
    }

    public Registrar_Atropelamento remover(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException();

        if (indice == 0) return removeInicio();
        if (indice == tamanho - 1) return removeUltimo();

        Elemento ou = this.primeiro;
        for (int i = 0; i < indice; i++)
            ou = ou.proximo;

        ou.anterior.proximo = ou.proximo;
        ou.proximo.anterior = ou.anterior;
        tamanho -= 1;
        return ou.getRegistrar_atropelamento();
    }

    public boolean remove(String nome) {
         Elemento ou = this.primeiro;
        for (int i = 0; i < this.tamanho; i++) {
            if (ou.getRegistrar_atropelamento().getContudor().getNome().equalsIgnoreCase(nome) ||
                    ou.getRegistrar_atropelamento().getVitima().getNome().equalsIgnoreCase(nome)) {
                if (i == 0) removeInicio();
                else if (i == tamanho - 1) removeUltimo();
                else {
                    try {
                        ou.anterior.proximo = ou.proximo;
                        ou.proximo.anterior = ou.anterior;
                    } catch (NullPointerException e) {

                    }
                    tamanho -= 1;
                }
                return true;
            }
            ou = ou.proximo;
        }

        return false;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        Elemento ocorre = primeiro;
        while (ocorre != null) {
            sb.append(ocorre.getRegistrar_atropelamento() + "\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }

    public String toStringVitima() {
        StringBuffer sb = new StringBuffer();

        Elemento ocorre = primeiro;
        while (ocorre != null) {
            sb.append(ocorre.getRegistrar_atropelamento().getVitima() + "\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }

    public String toStringCondutor() {
        StringBuffer sb = new StringBuffer();

        Elemento ocorre = primeiro;
        while (ocorre != null) {
            sb.append(ocorre.getRegistrar_atropelamento().getContudor() + "\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }

    public String toStringAcintesGraves() {
        StringBuffer sb = new StringBuffer();

        Elemento ocorre = primeiro;
        while (ocorre != null) {
            if (ocorre.registrar_atropelamento.isAcidedentes_graves())
                sb.append(ocorre.getRegistrar_atropelamento() + "\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }
}

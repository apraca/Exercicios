package br.com.bootcamp.aula3;

public class Celular implements Precedente<Celular>{

    private String numero;
    private String titular;


    public Celular(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.numero.compareTo(celular.numero) ;
    }

    @Override
    public String toString(){
        return "Celular: " + numero + ", Nome Titular:" + titular;
    }
}

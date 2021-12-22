package br.com.bootcamp.aula4.ex1;

public class Vestuario {
    String marca;
    String modelo;


    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vestuario() {

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString(){
        Vestuario vest = new Vestuario();
        return "Marca: "+ marca + " Modelo: " + modelo;
    }
}

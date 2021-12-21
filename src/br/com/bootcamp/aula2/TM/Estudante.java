package br.com.bootcamp.aula2.TM;

import java.time.LocalDate;

public class Estudante {
    String nome;
    LocalDate data_nasc;
    int num_mat;
    String serie;

    public Estudante() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(int i, int i1, int i2) {
        this.data_nasc = LocalDate.of(i,
                i1,
                i2);
    }

    public int getNum_mat() {
        return num_mat;
    }

    public void setNum_mat(int num_mat) {
        this.num_mat = num_mat;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }


}

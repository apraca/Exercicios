package br.com.bootcamp.aula2.TM;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    String cod_ident;
    String serie;

    List<Disciplina> disciplinas = new ArrayList<>();

    List<Estudante> estudantes = new ArrayList<>();

    public Turma() {
        this.cod_ident = cod_ident;
        this.serie = serie;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public String getCod_ident() {
        return cod_ident;
    }

    public void setCod_ident(String cod_ident) {
        this.cod_ident = cod_ident;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante estudante) {
        estudantes.add(estudante);
    }
}

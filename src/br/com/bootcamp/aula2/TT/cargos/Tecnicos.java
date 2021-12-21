package br.com.bootcamp.aula2.TT.cargos;

public class Tecnicos extends Funcionarios{
    int horas_trab;
    Double tecsal;

    @Override
    public Double pagarSalario(Double tecsal){
        Double salLiq;
        salLiq = tecsal + tecsal * 0.05;
        return salLiq;
    }

    public int getHoras_trab() {
        return horas_trab;
    }

    public void setHoras_trab(int horas_trab) {
        this.horas_trab = horas_trab;
    }

    public Double getTecsal() {
        return tecsal;
    }

    public void setTecsal(Double tecsal) {
        this.tecsal = tecsal;
    }
}

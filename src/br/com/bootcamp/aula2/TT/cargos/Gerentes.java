package br.com.bootcamp.aula2.TT.cargos;

public class Gerentes extends Funcionarios {
    int horas_trab;
    Double gerentsal;

    @Override
    public Double pagarSalario(Double gerentsal){
        Double salLiq;
        Double salHora = gerentsal / horas_trab;
        salLiq = gerentsal + salHora * 4;
        salLiq += gerentsal * 1.25;
        return salLiq;
    }

    public int getHoras_trab() {
        return horas_trab;
    }

    public void setHoras_trab(int horas_trab) {
        this.horas_trab = horas_trab;
    }

    public Double getGerentsal() {
        return gerentsal;
    }

    public void setGerentsal(Double gerentsal) {
        this.gerentsal = gerentsal;
    }
}

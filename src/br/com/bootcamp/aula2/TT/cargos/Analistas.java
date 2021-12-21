package br.com.bootcamp.aula2.TT.cargos;

public class Analistas extends Funcionarios{
    int horas_trab;
    Double analistsal;

    @Override
    public Double pagarSalario(Double analistsal){
        Double salLiq;
        Double salHora = analistsal / horas_trab;
        salLiq = analistsal + salHora * 4;
        salLiq += analistsal * 0.08;
        return salLiq;
    }

    public int getHoras_trab() {
        return horas_trab;
    }

    public void setHoras_trab(int horas_trab) {
        this.horas_trab = horas_trab;
    }

    public Double getAnalistsal() {
        return analistsal;
    }

    public void setAnalistsal(Double analistsal) {
        this.analistsal = analistsal;
    }
}

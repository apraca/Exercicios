package br.com.bootcamp.aula2.TT.cargos;

public class Diretores extends Funcionarios{
    int horas_trab;
    Double dirsal;

    @Override
    public Double pagarSalario(Double dirsal){
        Double salLiq;
        salLiq = dirsal;
        salLiq += dirsal * 0.03;
        return salLiq;
    }

    public int getHoras_trab() {
        return horas_trab;
    }

    public void setHoras_trab(int horas_trab) {
        this.horas_trab = horas_trab;
    }

    public Double getDirsal() {
        return dirsal;
    }

    public void setDirsal(Double dirsal) {
        this.dirsal = dirsal;
    }
}

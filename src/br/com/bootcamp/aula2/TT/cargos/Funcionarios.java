package br.com.bootcamp.aula2.TT.cargos;

import java.math.BigDecimal;

public abstract class Funcionarios {
    Double salario;

    public Double pagarSalario(Double salario){
        return salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

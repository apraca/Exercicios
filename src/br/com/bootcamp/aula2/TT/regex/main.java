package br.com.bootcamp.aula2.TT.regex;

public class main {

    public static void main(String[] args) {
        Senha s = new SenhaFraca();
        s.setEntrada("andre");

        Senha f = new SenhaForte();
        f.setEntrada("An@Trejjoum9y");

        Senha m = new SenhaMedia();
        m.setEntrada("andre5");

    }

}

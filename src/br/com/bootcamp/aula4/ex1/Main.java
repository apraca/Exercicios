package br.com.bootcamp.aula4.ex1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        GuardaRoupa g = new GuardaRoupa();

        List<Vestuario> inclusaoLista = new ArrayList<>();
        Vestuario inclusao = new Vestuario("Prada" ,"Novo");
        inclusaoLista.add(inclusao);
        Integer extKey = g.guardarVestuarios(inclusaoLista);
        System.out.println("Sua chave é: " + extKey);
        g.mostrarVestuario();
        g.devolverVestuarios(extKey);
        System.out.println(g.devolverVestuarios(extKey));

        Vestuario inclusao2 = new Vestuario("Hurley","SkatePro" );
        List<Vestuario> inclusaoLista2 = new ArrayList<>();
        inclusaoLista2.add(inclusao2);
        extKey = g.guardarVestuarios(inclusaoLista2);
        System.out.println("Sua chave é: " + extKey);
        g.mostrarVestuario();
        System.out.println(g.devolverVestuarios(extKey));


    }
}

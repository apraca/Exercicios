package br.com.bootcamp.aula4.ex1;

import java.util.*;

public class GuardaRoupa {
    Map<Integer, List> dicionario = new HashMap();
    Integer key = 0;


    public Integer guardarVestuarios(List<Vestuario> listaDeVestuarios){

        dicionario.put(++key, listaDeVestuarios);
        return key;

    }

    public void mostrarVestuario(){
        System.out.println(dicionario);
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        List<Vestuario> vest = new ArrayList<>();
        vest.addAll(dicionario.get(id));
//
        return vest;
    }

//    @Override
//    public String toString(){
//        Vestuario vest = new Vestuario();
//        return "Marca: "+ Vestuario.getMarca() + "Modelo: " + Vestuario.getModelo();
//    }

}

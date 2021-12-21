package br.com.bootcamp.aula2.TT.regex;

import java.util.regex.Pattern;

public class Senha {
    private String entrada = "";
    private Pattern pattern;


    public void Senha(){

    };


    public void setEntrada(String pwd){
        if (pwd.length() > 5){
            entrada = pwd;
        }

    }


}

package br.com.bootcamp.aula2.TT.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SenhaFraca extends Senha {
    String entrada;
    String pattern;



    @Override
    public void Senha(){

    }

    @Override
    public void setEntrada(String entrada) {
        pattern = "(?=.*?[a-z]).{5,}";


        try{
            if(entrada.matches(pattern)){
                this.entrada = entrada;
                System.out.println("Senha salva com sucesso!");
            }else {
                System.out.println("Senha inválida");
            }

        }catch (PatternSyntaxException e){
            e.getMessage();
        }

    }
}

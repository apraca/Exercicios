package br.com.bootcamp.aula2.TT.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SenhaForte extends Senha{
        String entrada;
        String pattern;

    @Override
    public void Senha() {

    }

    public void setEntrada(String entrada) {
        pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=])(?=\\S+$).{6,}";

        try{
            if (entrada.matches(pattern)){
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

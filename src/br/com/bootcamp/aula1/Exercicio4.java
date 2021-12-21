package br.com.bootcamp.aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int count = 0;
        Integer m = 0;

        List<Integer> primos = new ArrayList<>();



        Scanner inputm = new Scanner(System.in);


        for (Integer i = 1; i <= m; i++){
            for(Integer j = 2; j < i; j++){
                if(i % j == 0) count++;
            }
            if(count == 0) primos.add(i);

            count = 0;


        }

        System.out.println(primos);

    }
}

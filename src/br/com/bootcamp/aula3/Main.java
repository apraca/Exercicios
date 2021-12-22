package br.com.bootcamp.aula3;

public class Main{

    public static void main(String[] args) {
        Pessoa[] aPes={new Pessoa("Laura","36503987636")
                ,new Pessoa("Maria","090090998798")
                ,new Pessoa("Carlos","87687654509")
                ,new Pessoa("Virginia","98765412365")};

        SortUtil.sort(aPes);

        for (Pessoa p : aPes){
            System.out.println(p);
        }

        Celular[] aCel={new Celular("11908789089" , "Laura")
                ,new Celular("11987654321" , "Maria")
                ,new Celular("11987650987" , "Carlos")
                ,new Celular("11989765434" , "Virginia")};

        SortUtil.sort(aCel);

        for (Celular c: aCel) {
            System.out.println(c);
        }
    }


}

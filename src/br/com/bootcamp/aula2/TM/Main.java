package br.com.bootcamp.aula2.TM;

public class Main {
    public static void main(String[] args) {

        Disciplina historia = new Disciplina();
        historia.setNome("História");
        historia.setCarga_hora(110);

        Disciplina fisica = new Disciplina();
        fisica.setNome("Física");
        fisica.setCarga_hora(90);

        Estudante jorge = new Estudante();
        jorge.setNome("Jorge");
        jorge.setData_nasc(2008, 7, 11);
        jorge.setNum_mat(2);
        jorge.setSerie("9");

        Estudante alice = new Estudante();
        alice.setNome("Alice");
        alice.setData_nasc(2007, 8, 12);
        alice.setNum_mat(2);
        alice.setSerie("8");

        Estudante maria = new Estudante();
        maria.setNome("Maria");
        maria.setData_nasc(2009, 9, 12);
        maria.setNum_mat(2);
        maria.setSerie("7");

        Estudante carlos = new Estudante();
        carlos.setNome("Carlos");
        carlos.setData_nasc(2007, 5, 6);
        carlos.setNum_mat(2);
        carlos.setSerie("8");

        Estudante robson = new Estudante();
        robson.setNome("Robson");
        robson.setData_nasc(2008, 7, 9);
        robson.setNum_mat(2);
        robson.setSerie("8");

        Estudante joao = new Estudante();
        joao.setNome("João");
        joao.setData_nasc(2009, 3, 4);
        joao.setNum_mat(2);
        joao.setSerie("9");

        Turma oitava = new Turma();
        oitava.setCod_ident("A");
        oitava.setSerie("8");
        oitava.setEstudantes(robson);
        oitava.setEstudantes(carlos);
        oitava.setEstudantes(alice);
        oitava.setDisciplinas(fisica);
        oitava.setDisciplinas(historia);





    }

}

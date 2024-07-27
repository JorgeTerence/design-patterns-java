package org.example.ex1;

public class Teste {
    public static void main(String[] args) {
        Turma turma = new Turma("Sala B", "8 Serie");
        Aluno aluno = new Aluno("João",12,"8 serie", turma,"test@email.com","123456");
        Aluno aluno2 = aluno.clone();
        System.out.println(aluno.getNome().equals(aluno2.getNome()));
        System.out.println(aluno.getIdade()==(aluno2.getIdade()));
        System.out.println(aluno.getTurma().equals(aluno2.getTurma()));
        System.out.println(aluno.equals(aluno2));
    }
}

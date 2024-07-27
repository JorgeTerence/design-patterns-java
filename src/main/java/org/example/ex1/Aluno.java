package org.example.ex1;

import lombok.Data;

@Data
public class Aluno implements Cloneable {
    private String nome, serie, matricula;
    private int idade;
    private Turma turma;
    private Responsavel responsavel;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String serie, Turma turma, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
        this.responsavel = new Responsavel();
        this.turma = turma;
        responsavel.setEmail(email);
        responsavel.setTelefone(telefone);
    }

    @Override
    public Aluno clone() {
        try {
            return (Aluno) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

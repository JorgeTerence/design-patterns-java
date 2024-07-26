package org.example.singleton;

public class Teste {
    public static void main(String[] args) {
        Agenda.getInstance().ocupar("Domingo");
        Agenda.getInstance().ocupar("Segunda");
        System.out.println(Agenda.getInstance());
    }
}

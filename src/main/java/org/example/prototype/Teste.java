package org.example.prototype;

public class Teste {
    public static void main(String[] args) {
        Funcionario intern = FuncionarioRegistry.getPrototype("INTERN");
        System.out.println(intern);

        intern.setSalario(2500);
        intern.setUsaGravata(true);
        FuncionarioRegistry.savePrototype("TRAINEE", intern);

        Funcionario trainee = FuncionarioRegistry.getPrototype("TRAINEE");
        trainee.setNome("Phineas");
        System.out.println(trainee);
    }
}

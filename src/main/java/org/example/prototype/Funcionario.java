package org.example.prototype;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private double salario;
    private boolean usaGravata;
}

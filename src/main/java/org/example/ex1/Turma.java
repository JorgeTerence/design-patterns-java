package org.example.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Turma {
    private String sala;
    private String serie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return sala.equals(turma.sala) && serie.equals(turma.serie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sala, serie);
    }
}
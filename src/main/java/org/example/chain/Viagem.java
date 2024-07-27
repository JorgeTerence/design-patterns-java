package org.example.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Viagem {
    private Transporte transporte;
    private float distance;
}

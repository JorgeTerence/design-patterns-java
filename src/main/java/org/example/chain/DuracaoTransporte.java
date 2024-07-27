package org.example.chain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class DuracaoTransporte {
    protected DuracaoTransporte next;
    public abstract float calculateDuration(Viagem travel);
}

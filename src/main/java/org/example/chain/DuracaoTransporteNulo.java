package org.example.chain;

public class DuracaoTransporteNulo extends DuracaoTransporte {

    @Override
    public float calculateDuration(Viagem travel) {
        return 0;
    }
}

package org.example.chain;

public class DuracaoTransporteOnibus extends DuracaoTransporte {
    public DuracaoTransporteOnibus(DuracaoTransporte next) {
        super(next);
    }

    @Override
    public float calculateDuration(Viagem travel) {
        if (travel.getTransporte().equals(Transporte.BUS))
            return travel.getDistance() * 2;

        return next.calculateDuration(travel);
    }
}

package org.example.chain;

public class DuracaoTransportePe extends DuracaoTransporte {
    public DuracaoTransportePe(DuracaoTransporte next) {
        super(next);
    }

    @Override
    public float calculateDuration(Viagem travel) {
        if (travel.getTransporte().equals(Transporte.FOOT))
            return travel.getDistance() * 0.25f;

        return next.calculateDuration(travel);
    }
}

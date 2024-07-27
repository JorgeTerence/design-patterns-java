package org.example.chain;

public class DuracaoTransporteCarro extends DuracaoTransporte {
    public DuracaoTransporteCarro(DuracaoTransporte next) {
        super(next);
    }

    @Override
    public float calculateDuration(Viagem travel) {
        if (travel.getTransporte().equals(Transporte.CAR))
            return travel.getDistance() * 0.025f;

        return next.calculateDuration(travel);
    }
}

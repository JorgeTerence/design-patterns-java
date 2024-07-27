package org.example.chain;

public class DuracaoTransporteDuasRodas extends DuracaoTransporte {
    public DuracaoTransporteDuasRodas(DuracaoTransporte next) {
        super(next);
    }

    @Override
    public float calculateDuration(Viagem travel) {
        if (travel.getTransporte().equals(Transporte.MOTORCYCLE) || travel.getTransporte().equals(Transporte.BICYCLE))
            return travel.getDistance() * 0.75f;

        return next.calculateDuration(travel);
    }
}

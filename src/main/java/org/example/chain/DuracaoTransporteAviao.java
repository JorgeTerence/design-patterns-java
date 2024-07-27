package org.example.chain;

public class DuracaoTransporteAviao extends DuracaoTransporte {
    public DuracaoTransporteAviao(DuracaoTransporte next) {
        super(next);
    }

    @Override
    public float calculateDuration(Viagem travel) {
        if (travel.getTransporte().equals(Transporte.AIRPLANE))
            return 3;

        return next.calculateDuration(travel);
    }
}

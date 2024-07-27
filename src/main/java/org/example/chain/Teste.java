package org.example.chain;

public class Teste {
    public static void main(String[] args) {
        Viagem travel = new Viagem(Transporte.CAR, 20);
        DuracaoTransporte calcDuracao = new DuracaoTransporteAviao(
                new DuracaoTransporteCarro(
                        new DuracaoTransporteDuasRodas(
                                new DuracaoTransporteOnibus(
                                        new DuracaoTransportePe(
                                                new DuracaoTransporteNulo()
                                        )
                                )
                        )
                )
        );

        float duration = calcDuracao.calculateDuration(travel);
        System.out.printf("Duração da viagem de %.2fkm de %s: %.1fh", travel.getDistance(), travel.getTransporte(), duration);
    }
}

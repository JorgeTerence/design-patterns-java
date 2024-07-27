package org.example.chain;

public enum Transporte {
    AIRPLANE,
    CAR,
    BUS,
    MOTORCYCLE,
    BICYCLE,
    FOOT;

    public String toString() {
        return switch (this) {
            case AIRPLANE -> "avião";
            case CAR -> "carro";
            case BUS -> "ônibus";
            case MOTORCYCLE -> "motocicleta";
            case BICYCLE -> "bicicleta";
            case FOOT -> "pé";
        };
    }
}

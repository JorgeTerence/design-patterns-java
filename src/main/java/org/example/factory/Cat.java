package org.example.factory;

import lombok.*;

@Data
public class Cat {
    private String name;
    private Gender gender;
    private String color;
    private boolean oneBrainCell; // all orange cats have one brain cell

    public enum Gender { MALE, FEMALE }
    public class Factory {
        public static Cat getInstance(String color) throws IllegalArgumentException {
            Cat cat;
            switch (color) {
                case "orange":
                    cat = new OrangeCat();
                    cat.setColor("orange");
                    cat.setOneBrainCell(true);
                    return cat;
                case "black":
                    cat = new BlackCat();
                    cat.setColor("black");
                    cat.setOneBrainCell(false);
                    return cat;
                case "white":
                    cat = new WhiteCat();
                    cat.setColor("white");
                    cat.setOneBrainCell(false);
                    return cat;
                default:
                    throw new IllegalArgumentException("Tipo de gato não suportado");
            }
        }
    }
}

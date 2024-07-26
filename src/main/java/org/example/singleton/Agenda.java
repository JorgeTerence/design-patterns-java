package org.example.singleton;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Agenda {
    // Eager instance of the class
    private static final Agenda INSTANCE = new Agenda();
    private Map<String, Boolean> dias = new HashMap<>();

    private Agenda() {
        dias.put("Domingo", true);
        dias.put("Segunda", true);
        dias.put("Terça", true);
        dias.put("Quarta", true);
        dias.put("Quinta", true);
        dias.put("Sexta", true);
        dias.put("Sábado", true);
    }

    public void ocupar(String dia) {
        dias.replace(dia, false);
    }

    public static Agenda getInstance() {
        return INSTANCE;
    }

    public String toString() {
        return String.format(
                "[%d %d %d %d %d %d %d]",
                dias.get("Domingo") ? 1 : 0,
                dias.get("Segunda") ? 1 : 0,
                dias.get("Terça") ? 1 : 0,
                dias.get("Quarta") ? 1 : 0,
                dias.get("Quinta") ? 1 : 0,
                dias.get("Sexta") ? 1 : 0,
                dias.get("Sábado") ? 1 : 0
        );
    }
}

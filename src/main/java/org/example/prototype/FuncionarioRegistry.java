package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioRegistry {
    private static final Map<String, Funcionario> REGISTRY = new HashMap<>();

    static {
        Funcionario intern = new Funcionario("Carl", 0, false);
        Funcionario manager = new Funcionario("Francis", 12000, true);
        Funcionario agent = new Funcionario("Perry", 4000, true);

        REGISTRY.put("INTERN", intern);
        REGISTRY.put("MANAGER", manager);
        REGISTRY.put("AGENT", agent);
    }

    public static Map<String, Funcionario> getInstance() {
        return REGISTRY;
    }

    public static void savePrototype(String key, Funcionario prototype) {
        REGISTRY.put(key, prototype);
    }

    public static Funcionario getPrototype(String key) {
        Funcionario prototype = REGISTRY.get(key);
        return new Funcionario(prototype.getNome(), prototype.getSalario(), prototype.isUsaGravata());
    }
}

package org.example.proxy;

import org.example.factory.Cat;

import java.util.Map;

public class CatRepository {
    private static long counter = 0;
    private Map<Long, Cat> registry;

    public void register(Cat cat) {
        registry.put(counter, cat);
        counter++;
    }

    public Cat findById(long id) throws InterruptedException {
        Thread.sleep(100);
        return registry.get(id);
    }
}

package org.example.proxy;

import org.example.factory.Cat;

import java.util.Map;

public class CatService {
    private final CatRepository repository;

    public CatService(CatRepository repository) {
        this.repository = repository;
    }

    public void register(Cat cat) {
        repository.register(cat);
    }

    public Cat findById(long id) throws InterruptedException {
        return repository.findById(id);
    }
}

package org.example.proxy;

import org.example.factory.Cat;

import java.util.logging.Logger;

public class CatRepositoryProxy extends CatRepository {
    private static final Logger log = Logger.getLogger(CatService.class.getName());

    @Override
    public void register(Cat cat) {
        log.info("Conectando com BD...");
        super.register(cat);
        log.info("Gato registrado com sucesso");
    }

    @Override
    public Cat findById(long id) throws InterruptedException {
        log.info("Buscando query...");
        Cat res = super.findById(id);
        log.info(String.format("Gato [%d] encontrado com sucesso", id));
        return res;
    }
}

package org.example.proxy;

import org.example.factory.Cat;

public class Teste {
    public static void main(String[] args) {
        CatService service = new CatService(new CatRepositoryProxy());

        Cat myCat = Cat.Factory.getInstance("white");
        myCat.setName("Nicolau");
        myCat.setGender(Cat.Gender.MALE);
    }
}

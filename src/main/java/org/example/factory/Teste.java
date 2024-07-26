package org.example.factory;

public class Teste {
    public static void main(String[] args) {
        Cat myCat = Cat.Factory.getInstance("white");
        myCat.setName("Nicolau");
        myCat.setGender(Cat.Gender.MALE);

        System.out.println(myCat);
    }
}

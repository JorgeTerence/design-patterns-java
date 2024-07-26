package org.example.builder;

import java.time.LocalDate;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Book book = Book.builder()
                .name("Book of Bill")
                .authorName("Alex Hirsch")
                .publisherName("Barnes and Noble")
                .views(1000)
                .price(140)
                .releaseDate(LocalDate.of(2024, 7, 23))
                .build();

        System.out.println(book);

        Person friend1 = new Person.builder().name("Sarah").age(18).build();
        Person friend2 = new Person.builder().name("Nuno").age(17).build();
        Person friend3 = new Person.builder().name("Renato").age(53).build();
        Person friend4 = new Person.builder().name("Melina").age(14).build();

        Person person = new Person.builder()
                .name("Jorge")
                .age(18)
                .friends(List.of(friend1, friend2, friend3, friend4))
                .build();

        System.out.println(person);
    }
}

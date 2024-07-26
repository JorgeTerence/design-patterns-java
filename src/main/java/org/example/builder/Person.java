package org.example.builder;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String name;
    private int age;
    private List<Person> friends;

    public Person(String name, int age, List<Person> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public static class builder {
        private String name;
        private int age;
        private List<Person> friends;

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder age(int age) {
            this.age = age;
            return this;
        }

        public builder friends(List<Person> friends) {
            this.friends = friends;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.age, this.friends);
        }
    }
}

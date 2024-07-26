package org.example.adapter;

public class Teste {
    public static void main(String[] args) {
        Ingresso ticket1 = new Ingresso("Jorge", "Deadpool", 4);
        Ingresso ticket2 = new Ingresso("Melina", "Deadpool", 5);
        Ingresso ticket3 = new Ingresso("Felipe", "Deadpool", 6);
        Ingresso ticket4 = new Ingresso("Jorge", "Joker", 4);
        Ingresso duplicate = new Ingresso("Robson", "Deadpool", 4);

        BookingServiceAdapter service = new BookingServiceAdapter();
        service.book(ticket1);
        service.book(ticket2);
        service.book(ticket3);
        service.book(ticket4);

        try {
            service.book(duplicate);
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
}

package org.example.adapter;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BookingService {
    private static final BookingService INSTANCE = new BookingService();
    private final List<Ingresso> inventory = new ArrayList<>();

    private BookingService() {}
    public static BookingService getInstance() {
        return INSTANCE;
    }

    public void book(Ingresso ticket) {
       // Unsafe: people can book the same chair for the same movie
       inventory.add(ticket);
        System.out.printf("%s [%d] -> %s\n", ticket.getMovie(), ticket.getChairNumber(), ticket.getOwner());
    }
}

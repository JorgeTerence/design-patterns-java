package org.example.adapter;

public class BookingServiceAdapter {
    public void book(Ingresso ticket) throws IllegalStateException {
        for (Ingresso t : BookingService.getInstance().getInventory()) {
            if (ticket.getMovie().equals(t.getMovie()) && ticket.getChairNumber() == t.getChairNumber()) {
                throw new IllegalStateException(String.format("Chair [%d] already occupied for \"%s\"", ticket.getChairNumber(), ticket.getMovie()));
            }
        }

        BookingService.getInstance().book(ticket);
    }
}

package com.Evergent.CoreJAVA.Basava.Application2;

public abstract class TicketBookingAbstract implements TicketOperationsInterface{
    String area;
    String theatre;
    String movie;
    int numberOfViewers;
    int totalAmount;

    public TicketBookingAbstract(String area, String theatre, String movie, int numberOfViewers, int totalAmount) {
        this.area = area;
        this.theatre = theatre;
        this.movie = movie;
        this.numberOfViewers = numberOfViewers;
        this.totalAmount = totalAmount;
    }

    public void printInvoice() {
        System.out.println("       Your Invoice\n");
        System.out.println("Area: " + area);
        System.out.println("Theatre: " + theatre);
        System.out.println("Movie: " + movie);
        System.out.println("Number of viewers: " + numberOfViewers);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("\n\n");
    }

    public abstract void bookTicket();
    public abstract void cancelTicket();
}

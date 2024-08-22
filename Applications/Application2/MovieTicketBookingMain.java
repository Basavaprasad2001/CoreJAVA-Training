package com.Evergent.CoreJAVA.Basava.Application2;


public class MovieTicketBookingMain {

    static final int BALCONY_PRICE = 200;
    static final int GOLD_PRICE = 150;
    static final int SILVER_PRICE = 100;

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        bookingSystem.startBooking();
    }
}






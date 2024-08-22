package com.Evergent.CoreJAVA.Basava.Application2;

import java.util.Scanner;

public class TicketBookingSystem extends TicketBookingAbstract   {
    Scanner scanner = new Scanner(System.in);

    public TicketBookingSystem() {
        super("Null", "Null", "Null", 0, 0);
    }

    public void bookTicket() {
        System.out.println("Select the Area:");
        System.out.println("1. KPHB");
        System.out.println("2. Miyapur");
        System.out.println("3. Madhapur");
        System.out.print("Select your option: ");
        int areaOption = scanner.nextInt();
        System.out.println("==================================");
        switch (areaOption) {
            case 1:
                this.area = "KPHB";
                selectTheatreForKPHB();
                break;
            case 2:
                this.area = "Miyapur";
                selectTheatreForMiyapur();
                break;
            case 3:
                this.area = "Madhapur";
                selectTheatreForMadhapur();
                break;
            default:
                System.out.println("Invalid option. Exiting.");
                return;
            
        }
        

        System.out.println("Select Movie:");
        System.out.println("1. Kalki");
        System.out.println("2. Maharaja");
        System.out.print("Select your option: ");
        int movieOption = scanner.nextInt();
        if(movieOption==1) {
        	this.movie = "Kalki";
        }
        else if(movieOption==2) {
        	this.movie = "Maharaja";
        }
        else {
        	System.out.println("Invalid Option");
        }
        System.out.print("Enter number of viewers: ");
        this.numberOfViewers = scanner.nextInt();
        System.out.println("==================================");

        System.out.println("Choose your seat:");
        System.out.println("1. Balcony");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.print("Select your option: ");
        int seatOption = scanner.nextInt();
        System.out.println("==================================");
        switch (seatOption) {
            case 1:
                this.totalAmount = (numberOfViewers * MovieTicketBookingMain.BALCONY_PRICE);
                break;
            case 2:
                this.totalAmount = (numberOfViewers * MovieTicketBookingMain.GOLD_PRICE);
                break;
            case 3:
                this.totalAmount = (numberOfViewers * MovieTicketBookingMain.SILVER_PRICE);
                break;
            default:
                System.out.println("Invalid seat option.");
                return;
        }
        System.out.println("If you are an Evergent Technologies Employee Enter 1 to get 20% Discount");
        System.out.println("If you are not an Evergent Technologies Employee Enter 2 to get 10% Discount");
        System.out.println("If you are Rich Enter 3 to get a 20% Surcharge");
        System.out.println("Enter 4 for no Discount and no surcharge");
        System.out.print("Enter your value: ");
        int coupon = scanner.nextInt();

        switch (coupon) {
            case 1:
                this.totalAmount = (int) (this.totalAmount * 0.8);
                break;
            case 2:
                this.totalAmount = (int) (this.totalAmount * 0.9);  
                break;
            case 3:
                this.totalAmount = (int) (this.totalAmount * 1.2); 
                break;
            case 4:
            	this.totalAmount = (int) (this.totalAmount);
            default:
                System.out.println("Invalid option selected.");
                break;
        }
        System.out.println("Your Ticket bill is: " + totalAmount);
        System.out.println("==================================");
        System.out.println("\n\n");
    }

    private void selectTheatreForKPHB() {
        System.out.println("Select Theatre:");
        System.out.println("1. Vishwanath");
        System.out.println("2. Arjun");
        System.out.print("Select your option: ");
        int theatreOption = scanner.nextInt();
        if (theatreOption == 1) {
            this.theatre = "Vishwanath";
        } else if (theatreOption == 2) {
            this.theatre = "Arjun";
        } else {
            System.out.println("Invalid option. Exiting.");
        }
        System.out.println("==================================");
    }

    private void selectTheatreForMiyapur() {
        System.out.println("Select Theatre:");
        System.out.println("1. Miraj Cinemas");
        System.out.println("2. Sai Ranga");
        System.out.print("Select your option: ");
        int theatreOption = scanner.nextInt();
        if (theatreOption == 1) {
            this.theatre = "Miraj Cinemas";
        } else if (theatreOption == 2) {
            this.theatre = "Sai Ranga";
        } else {
            System.out.println("Invalid option. Exiting.");
        }
        System.out.println("==================================");
    }

    private void selectTheatreForMadhapur() {
        System.out.println("Select Theatre:");
        System.out.println("1. PVR");
        System.out.println("2. BR Hitech");
        System.out.print("Select your option: ");
        int theatreOption = scanner.nextInt();
        if (theatreOption == 1) {
            this.theatre = "PVR";
        } else if (theatreOption == 2) {
            this.theatre = "BR Hitech";
        } else {
            System.out.println("Invalid option. Exiting.");
        }
        System.out.println("==================================");
    }

    public void cancelTicket() {
        System.out.println("Are you sure you want to cancel the ticket?\n");
        System.out.println("Enter Y to cancel ticket\nEnter N to keep the ticket\n");
        System.out.println("Enter your option:");
        String response = scanner.next();
        if (response.equals("Y")||response.equals("y")) {
            this.area = "null";
            this.theatre = "null";
            this.movie = "null";
            this.numberOfViewers = 0;
            this.totalAmount = 0;
            System.out.println("\nYour ticket is cancelled.\n\n");
        }

    }

    public void startBooking() {
        while (true) {
            System.out.println("------------------------Book your movie ticket!!------------------------\n\n");
            System.out.println("Select the Option:");
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel a ticket");
            System.out.println("3. Print Invoice");
            System.out.println("4. Exit");
            System.out.print("Select your option: ");
            int option = scanner.nextInt();
            System.out.println("==================================");
            switch (option) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    cancelTicket();
                    break;
                case 3:
                    printInvoice();
                    break;
                case 4:
                    System.out.println("Thank You!!");
                    System.out.println("==================================");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("==================================");
                    break;
            }
        }
    }
}

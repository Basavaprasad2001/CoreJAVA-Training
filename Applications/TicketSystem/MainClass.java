package com.Evergent.CoreJAVA.CaseStudy.TicketSystem;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicketSystem ts = new TicketSystem();
		for(;;) {
			BeansClass bc = new BeansClass();
			System.out.println("Ticket Booking System");
			System.out.println("1. Book Ticket\n2. Process Ticket\n3. View Ticket\n4. Display All Tickets");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter Your Id: ");
			int id = sc.nextInt();
			System.out.println("enter your Name: ");
			String nam = sc.next();
			System.out.println("Enter Number Of People: ");
			int np = sc.nextInt();
			np = np*100;
			bc.settId(id);
			bc.setName(nam);
			bc.setPrice(np);
			ts.addTicket(bc);
			break;
		case 2:
			ts.processNextTicket();
			break;
		case 3:
			ts.peekNextTicket();
			break;
		case 4:
			ts.displayQueue();
			break;
		case 5:
			System.exit(0);
			break;
			
		}
		}
	}
}

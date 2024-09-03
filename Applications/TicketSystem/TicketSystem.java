package com.Evergent.CoreJAVA.CaseStudy.TicketSystem;
import java.util.*;

public class TicketSystem {
	
	ArrayDeque<BeansClass> ad = new ArrayDeque<BeansClass>();
	
	public void addTicket(BeansClass b) {
		ad.add(b);
		System.out.println("Ticket Booked Successfully");
	}
	public void processNextTicket() {
		if (ad.size() > 0) {
			System.out.println(ad.pollLast());
		}
		else {
			System.out.println("No Tickets Available");
		}
	}
	public void peekNextTicket() {
		if (ad.size() > 0) {
			System.out.println(ad.peekLast());
		}
		else {
			System.out.println("No Tickets Available");
		}
	}
	public void displayQueue() {
		if (ad.size() > 0) {
			for (BeansClass b : ad) {
				System.out.println("\nTicketId: " + b.gettId() + " | " + "CustomerName: " + b.getName()
						+ " | " + "TicketPrice: " + b.getPrice());
				System.out.println();
			}
			System.out.println("=========================================================================\n");
		} 
		else {
			System.out.println("No Tickets Booked");
			System.out.println();
		}
	}
	
}

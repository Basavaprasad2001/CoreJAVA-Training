package com.Evergent.CoreJAVA.CaseStudy.TicketSystem;

public class BeansClass {
	int tId;
	String name;
	double price;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TicketId: "+tId+" | CustomerName: "+name+" | TicketPrice "+price;
	}
}

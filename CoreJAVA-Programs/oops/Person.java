package com.Evergent.CoreJAVA.oops;

public class Person {

	String name = "basava";
	int age = 22;
	String address = "hyderabad";
	
	public void display() {
		System.out.println("name: "+name+"\nage: "+age+"\naddress: "+address);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.display();
		
		
	}

}

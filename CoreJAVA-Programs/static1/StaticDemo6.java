package com.Evergent.CoreJAVA.static1;

public class StaticDemo6 {
	
	static String name = "raju";
	int age = 20;
	String address = "hyderabad";
	
	
	public void display() {
		name = "basava";
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
	}
	

	public static void main(String[] args) {
		
		StaticDemo6 s1 = new StaticDemo6();
		System.out.println(s1.name);
		s1.display();
		
		StaticDemo6 s2 = new StaticDemo6();
		System.out.println(s2.name);	
	}
}

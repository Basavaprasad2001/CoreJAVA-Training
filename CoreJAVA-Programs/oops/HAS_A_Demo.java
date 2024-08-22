package com.Evergent.CoreJAVA.oops;

public class HAS_A_Demo {
	
	public void myData() {
		System.out.println("HAS_A_Demo");
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.display();
		
		HAS_A_Demo has = new HAS_A_Demo();
		has.myData();

	}

}

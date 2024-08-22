package com.Evergent.CoreJAVA.oops;

class MyPerson{
	public void personInfo() {
		System.out.println("Basava");
	}
}
class PersonDetails extends MyPerson{
	public void personData() {
		System.out.println("hyderabad");
	}
}
public class MultiLevel extends PersonDetails{
	public static void main(String[] args) {	
		MultiLevel ml = new MultiLevel();
		ml.personInfo();
		ml.personData();

	}
}

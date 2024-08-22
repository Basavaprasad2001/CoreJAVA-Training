package com.Evergent.CoreJAVA.constructor;

class Car{
	String color;
	int maxSpeed;
	
	Car(){
		color="white";
		maxSpeed=120;
	}
	
	Car(String color, int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	void display() {
		System.out.println("color: "+ color);
		System.out.println("MaxSpeed: "+maxSpeed);
	}
}

public class MyCar {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car("red",150);
		
		c1.display();
		c2.display();

	}

}

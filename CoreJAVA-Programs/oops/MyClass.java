package com.Evergent.CoreJAVA.oops;

public class MyClass extends Calculation {
	
	public void show() {
		System.out.println("local method");
	}
	
	public static void main(String[] args) {
		
		MyClass my = new MyClass();
		my.show();
		my.add();
		
	}

}

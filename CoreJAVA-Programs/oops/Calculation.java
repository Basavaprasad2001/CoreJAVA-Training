package com.Evergent.CoreJAVA.oops;
public class Calculation {

	int a = 10;
	int b = 20;
	int c;
	
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public void mul() {
		System.out.println(a*b);
	}
	public void div() {
		System.out.println(a/b);
	}
	public static void main(String[] args) {	
		Calculation cal = new Calculation();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		
	}
}

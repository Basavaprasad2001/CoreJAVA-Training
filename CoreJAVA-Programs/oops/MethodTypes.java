package com.Evergent.CoreJAVA.oops;

public class MethodTypes {

	public void show() {
		System.out.println("without parameter, with return value: 0");
	}
	
	public void myData(int a, int b) {
		System.out.println("with parameter, without return value: "+(a+b));
	}
	
	public int myMul(int a, int b) {
		System.out.print("with parameter, with return value: ");
		return a*b;
	}
	
	public int myChange() {
		System.out.print("without parameter, with return value: ");
		return 100;
	}
	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		mt.show();
		mt.myData(10, 20);
		System.out.println(mt.myMul(5, 5));
		System.out.println(mt.myChange());

	}

}

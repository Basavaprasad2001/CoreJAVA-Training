package com.Evergent.CoreJAVA.oops;

class MyBigData{
	public void myData() {
		System.out.println("MyBigData");
	}
}

public class MethodOverriding extends MyBigData{
	
	public void myData() {
		System.out.println("MyData");
	}
	
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {	
		MethodOverriding ovr = new MethodOverriding();
		ovr.myData();
		ovr.show();	
	}
}

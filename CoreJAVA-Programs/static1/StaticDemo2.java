package com.Evergent.CoreJAVA.static1;

public class StaticDemo2 {
	
	static String cname = "India";
	String name = "basava";
	
	static public void myData() {
		System.out.println("myData");
	}
	
	public void show() {
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		
		myData();
		System.out.println(cname);
		
	}

}

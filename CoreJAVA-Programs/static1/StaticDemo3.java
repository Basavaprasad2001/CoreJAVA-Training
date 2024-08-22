package com.Evergent.CoreJAVA.static1;

public class StaticDemo3 {
	
	static String cname = "India";
	String name = "basava";
	
	static public void myData() {
		
		//Cannot make a static reference to the non-static method show() from the type StaticDemo3
		//show();
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

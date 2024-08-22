package com.Evergent.CoreJAVA.static1;

public class StaticDemo5 {
	
	static String cname = "India";
	String name = "basava";
	
	static {
		System.out.println("static block");
	}
	
	static public void myData() {
		
		System.out.println("myData");
	}
	

	public static void main(String[] args) {
		
		System.out.println(cname);
		myData();
		
		
	}

}

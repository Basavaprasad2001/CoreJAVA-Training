package com.Evergent.CoreJAVA.static1;

public class StaticDemo4 {
	
	static String cname = "India";
	String name = "basava";
	
	static public void myData() {
		
		System.out.println("myData");
	}
	
	public void show() {
		myData();
		System.out.println("Show method: "+cname);
	}

	public static void main(String[] args) {
		
		myData();
		System.out.println(cname);
		StaticDemo4 sd4 = new StaticDemo4();
		sd4.show();
		
	}

}

package com.Evergent.CoreJAVA.final1;

public class FinalDemo1 {
	
	final String cname = "India";
	
	public void myData() {
		
		//The final field FinalDemo1.cname cannot be assigned
		//cname = "basava";
		System.out.println(cname);
	}
	public static void main(String[] args) {
		FinalDemo1 fd1 = new FinalDemo1();
		fd1.myData();
	}
}

package com.Evergent.CoreJAVA.final1;

class MyClass{
	final public void myProducts() {
		System.out.println("all products");
	}
}

public class FinalDemo2 extends MyClass{
	
	final String cname = "India";
	
	//Cannot override the final method from MyClass
	public void myProducts1() {
		System.out.println("hello products");
	}

	public static void main(String[] args) {
		
		FinalDemo2 fd2 = new FinalDemo2();
		fd2.myProducts();
		fd2.myProducts1();
	}

}

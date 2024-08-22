package com.Evergent.CoreJAVA.final1;

final class MyClass1{
	public void myProducts() {
		System.out.println("all products");
	}
}

//The type FinalDemo3 cannot subclass the final class MyClass1
public class FinalDemo3 //extends MyClass1
{
	
	final String cname = "India";
	
	//Cannot override the final method from MyClass
	public void myProducts1() {
		System.out.println("hello products");
	}

	public static void main(String[] args) {
		
		FinalDemo3 fd3 = new FinalDemo3();
		fd3.myProducts1();
		
		MyClass1 mc = new MyClass1();
		mc.myProducts();
	}

}

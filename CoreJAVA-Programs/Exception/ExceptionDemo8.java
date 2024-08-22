package com.Evergent.CoreJAVA.Exception;
// n)Throws an exception will be executed method by method
public class ExceptionDemo8 {
	String name = "null";
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public void myInfo() throws NullPointerException{
		myData();
		System.out.println("My Info Methods");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo8 ed8 = new ExceptionDemo8();
			ed8.myInfo();
		}
		catch(Exception e) {
			System.out.println("I can handle: "+e);
		}
	}
}

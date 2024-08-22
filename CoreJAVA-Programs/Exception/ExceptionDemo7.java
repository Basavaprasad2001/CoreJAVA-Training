package com.Evergent.CoreJAVA.Exception;
// n)Throws an exception will be executed method by method
public class ExceptionDemo7 {
	String name = "null";
	int k = 2;
	public void myData() throws NullPointerException{
			System.out.println("one");
			System.out.println(name.length());
			int t = 10/k;
			System.out.println("end");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7 ed3 = new ExceptionDemo7();
			ed3.myData();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}

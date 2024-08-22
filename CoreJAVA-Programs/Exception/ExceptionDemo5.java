package com.Evergent.CoreJAVA.Exception;
// m)Finally block, is executed if exception occurs or not
public class ExceptionDemo5 {	
	String name = "null";
	int k = 0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t = 10/k;
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle: "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle: "+e);
		}
		catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		finally {
			System.out.println("finally is executed when exception occured or not");
		}
	}
	public static void main(String[] args) {		
		ExceptionDemo5 ed3 = new ExceptionDemo5();
		ed3.myData();
	}
}

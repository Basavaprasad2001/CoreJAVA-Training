package com.Evergent.CoreJAVA.Exception;
/*
	q)We should follow exception hierarchical
 */
public class ExceptionDemo4 {
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
	}
	public static void main(String[] args) {		
		ExceptionDemo4 ed3 = new ExceptionDemo4();
		ed3.myData();
	}
}

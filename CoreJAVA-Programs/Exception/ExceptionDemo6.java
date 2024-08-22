package com.Evergent.CoreJAVA.Exception;
// p)Try followed by either catch or finally block
public class ExceptionDemo6 {
	String name = "null";
	int k = 0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t = 10/k;
			System.out.println("end");
		}
		finally {
			System.out.println("finally is executed when exception occured or not");
		}
	}
	public static void main(String[] args) {		
		ExceptionDemo6 ed3 = new ExceptionDemo6();
		ed3.myData();
	}
}

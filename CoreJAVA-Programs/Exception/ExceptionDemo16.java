package com.Evergent.CoreJAVA.Exception;

public class ExceptionDemo16 {
	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
	}
	public static void recursiveMethod() {
		recursiveMethod();
	}
}

package com.Evergent.CoreJAVA.Exception;
import java.util.*;
// user-defined exception = age is eligible for voting or not.
class IllegalAgeException extends Exception{
	public IllegalAgeException(String message) {
		System.err.println(message);
	}
}
public class ExceptionDemo10Age {
	public void ageData(int age) throws Exception{
		if(age<18) {
			System.out.println("You are a Minor");
			throw new IllegalAgeException("You are not eligible for voting");
		}
		else if(age>100) {
			System.out.println("You are a Ghost");
			throw new IllegalAgeException("You are not eligible for voting");
		}
		else {
			System.out.println("You are eligible for voting");
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		ExceptionDemo10Age ed9 = new ExceptionDemo10Age();
		try {
			ed9.ageData(age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

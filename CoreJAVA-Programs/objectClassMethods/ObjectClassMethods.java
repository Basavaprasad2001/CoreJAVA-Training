package com.Evergent.CoreJAVA.objectClassMethods;

final class Person{
	private String value;
	
	public Person(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value;
	}
	
	public String myData() {
		return value;
	}
}

public class ObjectClassMethods {

	public static void main(String[] args) {

		Person p = new Person("Hello, String World");
		System.out.println(p.toString());
		System.out.println(p.myData());
		
	}

}

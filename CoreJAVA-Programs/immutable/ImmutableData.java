package com.Evergent.CoreJAVA.immutable;

final class PersonImmutable{
	private final String name;
	private final int age;
	
	public PersonImmutable(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String myName() {
		return name;
	}
	
	public int myAge() {
		return age;
	}
}

public class ImmutableData {

	public static void main(String[] args) {

		PersonImmutable pi = new PersonImmutable("basava",22);
		System.out.println("Name: "+pi.myName());
		System.out.println("Age: "+pi.myAge());
		
	}

}

package com.Evergent.CoreJAVA.immutable;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" "+age;
	}
}

public class ImmutableStrings {

	public static void main(String[] args) {

		Person p = new Person("basava",22);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		
	}

}

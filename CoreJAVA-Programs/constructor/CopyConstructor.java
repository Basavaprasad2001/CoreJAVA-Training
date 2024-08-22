package com.Evergent.CoreJAVA.constructor;

public class CopyConstructor {	
	String name;
	int age;
	public CopyConstructor(String name,int age) {
		this.name = name;
		this.age=age;
	}
	public CopyConstructor(CopyConstructor c3) {
		this.name=c3.name;
		this.age=c3.age;
	}
	public void display() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor("bhanu",20);
		CopyConstructor c2 = new CopyConstructor(c1);
		c1.display();
		c2.display();
	}
}

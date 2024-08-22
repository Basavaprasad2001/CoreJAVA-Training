package com.Evergent.CoreJAVA.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno1, String ename1, double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	public void display() {
		System.out.println("eno: "+eno);
		System.out.println("ename: "+ename);
		System.out.println("sal: "+sal);	
	}
	public static void main(String[] args) {
		new Employee2();
		Employee2 emp = new Employee2(1,"basava",26900);
		emp.display();
	}
}

package com.Evergent.CoreJAVA.constructor;

public class Employee6 {	
	int eno;
	String ename;
	double sal;
	Employee6(int eno){
		this.eno=eno;
	}
	Employee6(int eno, String ename,double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("eno: "+eno);
		System.out.println("ename: "+ename);
		System.out.println("sal: "+sal);
	}
	public static void main(String[] args) {
		Employee6 t = new Employee6(1,"basava",50000);
		t.display();
	}
}

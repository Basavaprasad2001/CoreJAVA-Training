package com.Evergent.CoreJAVA.constructor;
public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	Employee3(int eno, String ename, double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("eno: "+eno);
		System.out.println("ename: "+ename);
		System.out.println("sal: "+sal);	
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp = new Employee3(1,"basava",26900);
		emp.display();
	}
}

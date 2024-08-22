package com.Evergent.CoreJAVA.constructor;
class MyEmployee{
	int eno;
	public MyEmployee() {
	}
	MyEmployee(int eno){
		System.out.println("super class: "+eno);
	}
}
public class Employee4 extends MyEmployee {
	int eno;
	String ename;
	double sal;	
	public Employee4(){
		System.out.println("default");
	}
	Employee4(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("ename: "+ename);
		System.out.println("sal: "+sal);
	}
	public static void main(String[] args) {
		new Employee4();
		Employee4 emp = new Employee4(1,"basava",50000);
		emp.display();
	}
}

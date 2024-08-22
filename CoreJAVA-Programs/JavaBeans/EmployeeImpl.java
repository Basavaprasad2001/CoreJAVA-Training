package com.Evergent.CoreJAVA.JavaBeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeBeans emp = new EmployeeBeans();
		emp.setEno(100);
		emp.setEname("basava");
		emp.setSal(20000);
		
		System.out.println("eno: "+emp.getEno());
		System.out.println("ename: "+emp.getEname());
		System.out.println("sal: "+emp.getSal());
	}
}

package com.Evergent.CoreJAVA.JavaBeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBeans stu = new StudentBeans();
		stu.setSno(100);
		stu.setSname("basava");
		stu.setAddress("hyderabad");
		
		System.out.println(stu);
	}
}

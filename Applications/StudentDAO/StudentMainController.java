package com.Evergent.CoreJAVA.StudentDAO;
import java.util.*;
public class StudentMainController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID: ");
		int sId = sc.nextInt();
		System.out.println("Enter student Name: ");
		String sName = sc.next();
		System.out.println("Enter student Marks: ");
		int sMarks = sc.nextInt();
		System.out.println("Enter student Course: ");
		String sCourse = sc.next();
		StudentServices scc = new StudentServices();
		int m = scc.add(sId, sName, sMarks, sCourse);
		System.out.println("Values Inserted Successfully: "+m);
	}

}

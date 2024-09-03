package com.Evergent.CoreJAVA.StudentDAO;
import java.util.*;
public class StudentDAO {
	public int addArray(StudentBean sb) {
		try {
			ArrayList ar = new ArrayList();
			ar.add(sb.getsId());
			ar.add(sb.getsName());
			ar.add(sb.getsMarks());
			ar.add(sb.getsCourse());
			ar.add(sb.getsGrade());
			System.out.println(ar);
			System.out.println("student ID: "+sb.getsId());
			System.out.println("student Name: "+sb.getsName());
			System.out.println("student Marks: "+sb.getsMarks());
			System.out.println("student Course: "+sb.getsCourse());
			System.out.println("student Grade: "+sb.getsGrade());
			return 1;
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		
	}
}

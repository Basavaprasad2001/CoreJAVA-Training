package com.Evergent.CoreJAVA.StudentDAO;

public class StudentServices {
	String sGrade = "";
	public int add(int sId, String sName, int sMarks, String sCourse) {
		if(sMarks>90) {
			sGrade = "A";
		}
		else if(sMarks>80 && sMarks<91){
			sGrade = "B";
		}
		else if(sMarks>70 && sMarks<81){
			sGrade = "C";
		}
		else if(sMarks>=60 && sMarks<71){
			sGrade = "C";
		}
		else if(sMarks<60){
			sGrade = "Fail";
		}
		StudentBean sb = new StudentBean();
		sb.setsId(sId);
		sb.setsName(sName);
		sb.setsMarks(sMarks);
		sb.setsCourse(sCourse);
		sb.setsGrade(sGrade);
		StudentDAO sdao = new StudentDAO();
		int t = sdao.addArray(sb);
		return t;
	}
}

package com.Evergent.CoreJAVA.collection.task3;

public class Patient {
	private int pId;
	private String pName;
	private String  problem;
	private int age;
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getpId() {
		return pId;
	}
	public void setPatientName(String pName) {
		this.pName = pName;
	}
	public String getPatientName() {
		return pName;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getProblem() {
		return problem;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
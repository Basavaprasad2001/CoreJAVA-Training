package com.Evergent.CoreJAVA.Basava.HospitalFinalApplication;



public class HospitalService {
	String str="";
	HospitalDAO hDAO=new HospitalDAO();
	public int patientIntake(int pId,String pName, String problem,int age)
	{
		HospitalBean hospitalBean=new HospitalBean();
		hospitalBean.setpId(pId);
		hospitalBean.setpName(pName);
		hospitalBean.setProblem(problem);
		hospitalBean.setAge(age);
		int re=hDAO.createPatient(hospitalBean);
		return re;
	}
	public void showPatients(int pId)
	{	
		hDAO.showPatient(pId);
		
	}
	public void updatePatient(int pId, String uName) {
		hDAO.updatePatient(pId, uName);
	}
	public void deletePatient(int pId) {
		hDAO.deletePatient(pId);
	}
	public void getAllPatientDetails() {
		hDAO.showAllPatientDetails();
	}
}

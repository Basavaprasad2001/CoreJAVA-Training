package com.Evergent.CoreJAVA.Basava.HospitalFinalApplication;


import java.util.Scanner;





public class HospitalController {
public static void main(String args[])
{
	int pId=0;
	String pName="";
	String problem="";
	int age=0;
	int ch,ch1=1;
	Scanner s=new Scanner(System.in);
	System.out.println("------------------------WELCOME TO YOUR HOSPITAL---------------------");
	HospitalService hospitalService = new HospitalService();
	while(ch1!=0)
	{
		System.out.println();
		System.out.println("1.Patient Intake");
		System.out.println("2.Get Patient Details With PatientID");
		System.out.println("3.Update Patient Details");
		System.out.println("4.Delete Patient");
		System.out.println("5.Display All Patients\n");
		System.out.print("Enter Your Choice:");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:
				System.out.print("\nEnter Patient ID: ");
				pId = s.nextInt();
				System.out.print("Enter Patient Name: ");
				pName = s.next();	
				System.out.print("Enter Patient problem: ");
				problem=s.next();
				System.out.print("Enter Patient Age: ");
				age = s.nextInt();
				hospitalService.patientIntake(pId,pName,problem,age);	
				System.out.println("\nPatient Intake successfully");
				break;
				
			case 2:
				try
					{
					System.out.println("Enter your pId number");
					int pId1=s.nextInt();
					hospitalService.showPatients(pId1);
					
					}catch(Exception e){e.printStackTrace();}
					break;
					
			case 3:
				try {
					System.out.println("Enter your pId number where Name to be Updated:");
					int pId2=s.nextInt();
					System.out.println("Enter Updated Name:");
					String uName = s.next();
					hospitalService.updatePatient(pId2, uName);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 4:
				try {
					System.out.println("Enter your pId number");
					int pId3=s.nextInt();
					hospitalService.deletePatient(pId3);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
					
			case 5:
				try
					{	
						hospitalService.getAllPatientDetails();
					}catch(Exception e){e.printStackTrace();}
					break;
			
			
			}
	}
}
}

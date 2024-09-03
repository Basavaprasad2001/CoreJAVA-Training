package com.Evergent.CoreJAVA.collection.task3;

import java.util.Scanner;

public class Patient_p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PatientInterface pat = new PatientImp();
		for (;;) {
			System.out.println("1.Patient Intake\n2.Search by PatientId\n3.Display All Patient Details\n4.Exit");
			System.out.print("\nChoose Your Option: ");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.print("\nEnter the PatientId: ");
				int pId = sc.nextInt();
				System.out.print("\nEnter the Patient name: ");
				String pName = sc.next();
				System.out.print("\nEnter the Problem: ");
				String problem = sc.next();
				System.out.print("\nEnter the age: ");
				int age = sc.nextInt();
				Patient b = new Patient();
				b.setpId(pId);
				b.setPatientName(pName);
				b.setProblem(problem);
				b.setAge(age);
				pat.patientIntake(b);
				System.out.println("\n======================\n");
				break;
			case 2:
				System.out.print("\nEnter the pId: ");
				pId = sc.nextInt();
				pat.searchByPId(pId);
				break;

			case 3:
				pat.getAllPatientDetails();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}

package com.Evergent.CoreJAVA.collection.task3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PatientImp implements PatientInterface {
	Set<Patient> patientSet = null;

	public PatientImp() {
		patientSet = new LinkedHashSet<Patient>();
	}

	@Override
	public int patientIntake(Patient b) {
		patientSet.add(b);
		return b.getpId();
	}

	@Override
	public void searchByPId(int pId) {
		boolean b = false;
		if (patientSet.size() > 0 && patientSet != null) {
			for (Patient pat : patientSet) {
				if (pat.getpId() == pId) {
					System.out.println("\nPatientId: " + pat.getpId() + " | " + "PatientName: " + pat.getPatientName()
							+ " | " + "PatientProblem: " + pat.getProblem() + " | " + "PatientAge: " + pat.getAge());
					System.out.println();
					b = true;
					break;
				}
			}
			System.out.println("=========================================================================\n");
		}
		if (!b) {
			System.out.println("There is no patient found with that Id");
			System.out.println();
		}
	}

	@Override
	public void getAllPatientDetails() {
		if (patientSet.size() > 0) {
			for (Patient pat : patientSet) {
				System.out.println("\nPatientId: " + pat.getpId() + " | " + "PatientName: " + pat.getPatientName()
						+ " | " + "PatientProblem: " + pat.getProblem() + " | " + "PatientAge: " + pat.getAge());
				System.out.println();
			}
			System.out.println("=========================================================================\n");
		} else {
			System.out.println("No Patients Registered");
			System.out.println();
		}
	}
}

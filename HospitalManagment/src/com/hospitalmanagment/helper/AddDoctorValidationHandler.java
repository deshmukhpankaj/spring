package com.hospitalmanagment.helper;

import java.util.ArrayList;
import java.util.List;

import com.hospitalmanagment.bo.Doctor;

public class AddDoctorValidationHandler implements ValidatorHandler {

	@Override
	public List<String> handler(Object object) {
		List<String> errorsList = null;
		Doctor doctor = (Doctor)object;
		errorsList = new ArrayList<String>();
		if(doctor.getDoctorName() == null || doctor.getDoctorName().trim().length() == 0) {
			errorsList.add("Doctor name should not be blank");
		}if(doctor.getContactNo() == null || doctor.getContactNo().trim().length() == 0) {
			errorsList.add("Contact No Should not be blank");
		}if(doctor.getAlternateContactNo() == null || doctor.getAlternateContactNo().trim().length() == 0) {
			errorsList.add("Alternate Contact No Should not be blank");
		}if(doctor.getEmailAddress() == null || doctor.getEmailAddress().trim().length() == 0) {
			errorsList.add("Email Address No Should not be blank");
		}if(doctor.getAge() == 0 || doctor.getAge() == 0) {
			errorsList.add("age No Should not be blank");
		}if(doctor.getGender() == null || doctor.getGender().trim().length() == 0) {
			errorsList.add("Gender No Should not be blank");
		}if(doctor.getQualification() == null || doctor.getQualification().trim().length() == 0) {
			errorsList.add("Qualification No Should not be blank");
		}if(doctor.getSpecilization() == null || doctor.getSpecilization().trim().length() == 0) {
			errorsList.add("Specilization No Should not be blank");
		}if(doctor.getExperience() == null || doctor.getExperience().trim().length() == 0) {
			errorsList.add("Experience No Should not be blank");
		}if(doctor.getAddress() == null || doctor.getAddress().trim().length() == 0) {
			errorsList.add("Address No Should not be blank");
		}
		return errorsList;
	}

}

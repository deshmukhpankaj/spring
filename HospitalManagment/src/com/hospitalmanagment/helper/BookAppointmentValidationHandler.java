package com.hospitalmanagment.helper;

import java.util.ArrayList;
import java.util.List;

import com.hospitalmanagment.bo.Appointment;

public class BookAppointmentValidationHandler implements ValidatorHandler {

	@Override
	public List<String> handler(Object object) {
		List<String> errorsList = null;
		Appointment appointment = (Appointment)object;
		
		errorsList = new ArrayList<>();

		if (appointment.getPatientName() == null || appointment.getPatientName().trim().length() == 0) {
			errorsList.add("Patient name should not be empty");
		}
		if (appointment.getAppointmentDate() == null || appointment.getAppointmentDate().trim().length() == 0) {
			errorsList.add("Appointment Date should not be empty");
		}
		if (appointment.getAppointmentTime() == null || appointment.getAppointmentTime().trim().length() == 0) {
			errorsList.add("Appointment Time should not be empty");
		}
		if (appointment.getContactNo() == null || appointment.getContactNo().trim().length() == 0) {
			errorsList.add("Contact should not be empty");
		}
		if (appointment.getAlternateContactNo() == null || appointment.getAlternateContactNo().trim().length() == 0) {
			errorsList.add("Alternated Contact should not be empty");
		}
		if (appointment.getEmailAddress() == null || appointment.getEmailAddress().trim().length() == 0) {
			errorsList.add("Email Address should not be empty");
		}
		if (appointment.getDoctorName() == null || appointment.getDoctorName().trim().length() == 0) {
			errorsList.add("Doctor Name should not be empty");
		}
		
		return errorsList;
	}

}

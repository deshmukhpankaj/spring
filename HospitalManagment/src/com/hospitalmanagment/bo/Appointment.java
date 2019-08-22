package com.hospitalmanagment.bo;

import java.io.Serializable;

public class Appointment implements Serializable {

	private static final long serialVersionUID = -5924302391244725982L;
	
	protected String patientName;
	protected String contactNo;
	protected String alternateContactNo;
	protected String emailAddress;
	protected String appointmentDate;
	protected String appointmentTime;
	protected String doctorName;

	public Appointment() {
	}

	public Appointment(String patientName, String contactNo, String alternateContactNo, String emailAddress,
			String appointmentDate, String appointmentTime, String doctorName) {
		this.patientName = patientName;
		this.contactNo = contactNo;
		this.alternateContactNo = alternateContactNo;
		this.emailAddress = emailAddress;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.doctorName = doctorName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAlternateContactNo() {
		return alternateContactNo;
	}

	public void setAlternateContactNo(String alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Appointment [patientName=" + patientName + ", contactNo=" + contactNo + ", alternateContactNo="
				+ alternateContactNo + ", emailAddress=" + emailAddress + ", appointmentDate=" + appointmentDate
				+ ", appointmentTime=" + appointmentTime + ", doctorName=" + doctorName + "]";
	}

}

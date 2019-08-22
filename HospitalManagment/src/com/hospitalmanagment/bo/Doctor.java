package com.hospitalmanagment.bo;

import java.io.Serializable;

public class Doctor implements Serializable {

	private static final long serialVersionUID = -5827385173177367252L;
	
	protected String doctorName;
	protected String contactNo;
	protected String alternateContactNo;
	protected String emailAddress;
	protected int age;
	protected String gender;
	protected String qualification;
	protected String specilization;
	protected String experience;
	protected String address;

	public Doctor() {

	}

	public Doctor(String doctorName, String contactNo, String alternateContactNo, String emailAddress, int age,
			String gender, String qualification, String specilization, String experience, String address) {
		this.doctorName = doctorName;
		this.contactNo = contactNo;
		this.alternateContactNo = alternateContactNo;
		this.emailAddress = emailAddress;
		this.age = age;
		this.gender = gender;
		this.qualification = qualification;
		this.specilization = specilization;
		this.experience = experience;
		this.address = address;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", contactNo=" + contactNo + ", alternateContactNo="
				+ alternateContactNo + ", emailAddress=" + emailAddress + ", age=" + age + ", gender=" + gender
				+ ", qualification=" + qualification + ", specilization=" + specilization + ", experience=" + experience
				+ ", address=" + address + "]";
	}

}

package com.hospitalmanagment.pojo;

import java.util.Random;

import com.hospitalmanagment.bo.Doctor;

public class AddDoctorManager {
	public int addDoctor(Doctor doctor) {
		return new Random().nextInt(99);
	}

}

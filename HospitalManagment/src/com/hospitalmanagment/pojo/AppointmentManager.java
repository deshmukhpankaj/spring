package com.hospitalmanagment.pojo;

import java.util.Random;

import com.hospitalmanagment.bo.Appointment;

public class AppointmentManager {
	public int bookAppointment(Appointment appointment) {
		System.out.println(appointment);
		return new Random().nextInt(99);
	}
}

package com.hospitalmanagment.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospitalmanagment.bo.Appointment;
import com.hospitalmanagment.helper.BookAppointmentValidationHandler;
import com.hospitalmanagment.helper.GenericValidationHandler;
import com.hospitalmanagment.helper.RequestMapperHandler;
import com.hospitalmanagment.pojo.AppointmentManager;

public class BookAppointmentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Appointment appointment = null;
		AppointmentManager appointmentManager = null;
		int appointmentNo = 0;
		boolean flag = false;
		GenericValidationHandler genericValidationHandler = null;
		genericValidationHandler = new GenericValidationHandler();

		
		try {
			appointment = (Appointment) RequestMapperHandler.wrap(req, Appointment.class);
			flag = genericValidationHandler.handleValidation(appointment, req, resp, BookAppointmentValidationHandler.class, "book-appointment");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag == true) {
			appointmentManager = new AppointmentManager();
			appointmentNo = appointmentManager.bookAppointment(appointment);
			req.setAttribute("appointment", appointment);
			req.setAttribute("appointmentNo", appointmentNo);
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("show-appointment.jsp");
			requestDispatcher.forward(req, resp);
				
		}else {
			return ;
		}

	}

}

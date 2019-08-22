package com.hospitalmanagment.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospitalmanagment.bo.Doctor;
import com.hospitalmanagment.helper.AddDoctorValidationHandler;
import com.hospitalmanagment.helper.GenericValidationHandler;
import com.hospitalmanagment.helper.RequestMapperHandler;
import com.hospitalmanagment.pojo.AddDoctorManager;

@WebServlet("/AddDoctorServlet")
public class AddDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor doctor = null;
		int doctorNo = 0;
		AddDoctorManager addDoctorManager = null;
		boolean flag = false;
		GenericValidationHandler genericValidationHandler = null;
		genericValidationHandler = new GenericValidationHandler();
		
		
		try {
			doctor = (Doctor)RequestMapperHandler.wrap(request, Doctor.class);
			flag = genericValidationHandler.handleValidation(doctor, request, response, AddDoctorValidationHandler.class, "add-doctor");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag == true) {
			addDoctorManager = new AddDoctorManager();
			doctorNo = addDoctorManager.addDoctor(doctor);
			request.setAttribute("doctor", doctor);
			request.setAttribute("doctorNo", doctorNo);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-new-doctor.jsp");
			requestDispatcher.forward(request, response);
		}else {
			return ;
		}
		
	}

}

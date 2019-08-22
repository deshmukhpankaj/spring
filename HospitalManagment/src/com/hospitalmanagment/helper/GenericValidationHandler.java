package com.hospitalmanagment.helper;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenericValidationHandler {
	public boolean handleValidation(Object object,HttpServletRequest request, HttpServletResponse response, Class<?> handlerClass,String sourcePage) throws InstantiationException, IllegalAccessException, ServletException, IOException {
			ValidatorHandler validatorHandler;
			Object inputObject = object;
			List<String> errorsList = null;
			boolean flag = false;
			validatorHandler = (ValidatorHandler) handlerClass.newInstance();
			errorsList = validatorHandler.handler(inputObject);
		
			if(errorsList.size()>0) {
				flag = false;
				request.setAttribute("errorsList", errorsList);
				request.setAttribute("inputObject", object);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher(sourcePage+".jsp");
				requestDispatcher.forward(request, response);
			}else {
				flag = true;
			}
		return flag;
	}

}

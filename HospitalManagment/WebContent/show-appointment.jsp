<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Appointment</title>
</head>
<body>
		<h2 align="center" style="color: #770808"> Appointment Details</h2>
	<table style="margin-left: 600px; margin-top: 20px;text-align: center; column-rule-color: blue;background-color: #F4D7D7;padding: 20px; columns: 30px; border: none;align-self: center;">
		<tr style=";">
			<td>Patient Name:</td>
			<td>${appointment.patientName}</td>
		</tr>
		<tr>
			<td>Contact No:</td>
			<td>${appointment.contactNo}</td>
		</tr>
		<tr>
			<td>Alternate Contact No:</td>
			<td>${appointment.alternateContactNo}</td>
		</tr>
		<tr>
			<td>Email Address:</td>
			<td>${appointment.emailAddress}</td>
		</tr>
		<tr>
			<td>Appointment Date:</td>
			<td>${appointment.appointmentDate}</td>
		</tr>
		<tr>
			<td>Appointment Time:</td>
			<td>${appointment.appointmentTime}</td>
		</tr>
		<tr>
			<td>Doctor Name:</td>
			<td>${appointment.doctorName}</td>
		</tr>
		<tr>
			<td>Appointment No:</td>
			<td>${appointmentNo}</td>
		</tr>
		
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Doctor</title>
</head>
<body>
		<h2 align="center" style="color: #770808"> Doctor Details</h2>
	<table style="margin-left: 600px; margin-top: 20px;text-align: center; column-rule-color: blue;background-color: #F4D7D7;padding: 20px; columns: 30px;border: none;align-self: center;border-color: navy;border: 2px solid;">
		<tr style=";">
			<td>Doctor Name:</td>
			<td>${doctor.doctorName}</td>
		</tr>
		<tr>
			<td>Contact No:</td>
			<td>${doctor.contactNo}</td>
		</tr>
		<tr>
			<td>Alternate Contact No:</td>
			<td>${doctor.alternateContactNo}</td>
		</tr>
		<tr>
			<td>Email Address:</td>
			<td>${doctor.emailAddress}</td>
		</tr>
		<tr>
			<td>Age:</td>
			<td>${doctor.age}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${doctor.gender}</td>
		</tr>
		<tr>
			<td>Qualification:</td>
			<td>${doctor.qualification}</td>
		</tr>
		<tr>
			<td>Specialization:</td>
			<td>${doctor.specilization}</td>
		</tr>
		<tr>
			<td>Experience:</td>
			<td>${doctor.experience}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>${doctor.address}</td>
		</tr>
		<tr>
			<td>Doctor No:</td>
			<td>${doctorNo}</td>
		</tr>
		
	
		
	</table>
</body>
</html>
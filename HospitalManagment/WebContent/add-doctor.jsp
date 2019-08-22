<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>
</head>
<body>
	<c:if test="${not empty errorsList}">
		<c:forEach items="${errorsList}" var="item">
			<p style="color: red">${item}</p>
		</c:forEach>
	</c:if>
	<h2 align="center" style="color: #770808">Add Doctor Details</h2>
	
	<form action="addDoctorServlet" method="post">
	<table style="margin-left: 600px; margin-top: 20px;text-align: center; column-rule-color: blue;background-color: #F4D7D7;padding: 20px; columns: 30px;border: none;align-self:center;">
		<tr>
			<td>Doctor Name:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
				<input type="text" name="doctorName" value="${inputObject.doctorName}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="doctorName">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Contact No:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="contactNo" value="${inputObject.contactNo}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="contactNo">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Alternate Contact No:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="alternateContactNo" value="${inputObject.alternateContactNo}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="alternateContactNo">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Email Address:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="emailAddress" value="${inputObject.emailAddress}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="emailAddress">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Age:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="age" value="${inputObject.age}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="age">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Gender:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="gender" value="${inputObject.gender}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="gender">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
			<tr>
			<td>Qualification:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="qualification" value="${inputObject.qualification}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="qualification">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Specialization:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="specilization" value="${inputObject.specilization}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="specilization">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Experience:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="experience" value="${inputObject.experience}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="experience">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		<tr>
			<td>Address:</td>
			<td> <c:choose>
			
				<c:when test="${not empty inputObject }">
					<input type="text" name="address" value="${inputObject.address}"> 
				</c:when>
				
				<c:otherwise>
					<input type="text" name="address">
				</c:otherwise>
				
			</c:choose> </td>
		</tr>
		
		
		<tr>
			<td style="border-style: none; margin-top: 20px;"></td>
			<td style="border-style: none;"></td>
		</tr>
		<tr>
			<td style="border-style: none; margin-top: 20px;"></td>
			<td style="border-style: none;"></td>
		</tr>
		<tr>
			<td style="border-style: none; margin-top: 20px;"></td>
			<td style="border-style: none;"><input type = "submit" value="Add Doctor"></td>
		</tr>
	</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Apply Personal Loan</title>
	</head>
	<body style = "align-self:  center;">
		<form action="appservlet" method = "post">
		<h1>Personal Loan Information</h1>
		
		<table>
			<tr>
				<td>Loan Type</td>
				<td><input type = "text" name = "loanType"></td>
			</tr>
			<tr>
				<td>Interest Rate</td>
				<td><input type = "text" name = "interestRate"></td>
			</tr>
			<tr>
				<td>Tenure(In Months)</td>
				<td><input type = "text" name = "tenure"></td>
			</tr>
			<tr>
				<td>Bank Name</td>
				<td>
					<select name="bank">
						<option value = "sbi">State Bank Of India</option>
						<option value = "boi">Bank Of India</option>
						<option value = "axis"> Axis Bank</option>
						<option value = "hdfc"> HDFC Bank</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>BranchCode</td>
				<td><input type = "text" name = "branchCode"></td>
			</tr>
			<tr>
				<td>Location Of Bank</td>
				<td>
					<select name="location">
						<option value = "mumbai" >Mumbai</option>
						<option value = "hyderbad">Hyderbad</option>
						<option value = "banglore"> Banglore</option>
						<option value = "chennai"> Chennai</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Purpose</td>
				<td><textarea rows="3" cols="20" name="purpose"></textarea></td>
			</tr>
		</table>
		<h1>Applicant Information</h1>
		<table>
			<tr>
				<td>First Name</td>
				<td><input type = "text" name = "firstName"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type = "text" name = "branchCode"></td>
			</tr>
			<tr>
				<td>Date Of Birth(DD/MM/YYYY)</td>
				<td><input type = "text" name = "dob"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<input type="radio" name="gender" value="male">Male
					<input type = "radio" name = "gender" value="female"> Female
				</td>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><input type = "text" name = "contactNo"></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td><input type = "text" name = "emailAddress"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea rows="3" cols="20" name="address"></textarea></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td>
					<select name="designation">
						<option value = "student">Student</option>
						<option value = "teacher">Teacher</option>
						<option value = "buisnessman"> BusinessMan</option>
						<option value = "other"> Other</option>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type = "submit" value = "Apply Loan"></td>
			</tr>
		</table>
		</form>
	</body>
</html>
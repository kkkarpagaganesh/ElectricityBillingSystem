
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>

<style>
body {
	background-image: url('New-areva-10258.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

input[type=Number], input[type=text], input[type=email], select[name=gender]
	{
	width: 100%;
	padding: 9px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #FFB6C1;
	color: black;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}
/**table{
border-collapse:collapse;
table-layout:auto;
width:80%;
}
th,td{
padding:5px;
}**/
form {
	display: flex;
	justify-content: space-between;
}
</style>

</head>
<%
			String u = (String) request.getSession().getAttribute("Customer ID");
			if (u != null) {
				out.print("welcome!\n Customer ID : " + u);
		
			} 
		/*	else {
				response.sendRedirect("expire.jsp");
			}*/
		%>

<h1 align="center">Electricity billing system</h1>
<form action="MeterdetailsServlet" method="post">

<table align="center" style="padding: 3px 40px">
	<tbody>
		<tr>
			<td><button type="button"
			
					style="height: 50px; width: 120px;">My Profile</button></td>

			<td><button type="submit"
			
					style="height: 50px; width: 120px;">Billing</button></td>

			<td><button type="button"
				
					style="height: 50px; width: 120px;">Payment</button></td>


			<td><button type="button"
					onclick="window.location.href='index.html'"
					style="height: 50px; width: 100px;">Logout</button></td>



			<!-- td><button type="submit" style="height: 50px; width: 100px;">Logout</button></td-->
		</tr>
	</tbody>
</table>

</form>

<h2 align="center" style="padding: 10px 50px">Personal Details</h2>
<form action="MeterdetailsServlet" method="post">

	<table align="center" style="width: 25%" border="5" bgcolor="white">
		<tbody>
		<thead>
			<tr>
				<th align="center" bgcolor="grey"
					style="font-size: 25px; color: white">Circle Details</th>
			</tr>
			<tr>
				<th align="left">Circle no : ${list3.circle_no}</th>
			</tr>
			<tr>
				<th align="left">Circle name : ${list3.circle_name}</th>
			</tr>
			<tr>
				<th align="left">Division name : ${list3.division_name}</th>
			</tr>

		</thead>


		<!-- /table>
			
	
	
<table align="center" style="width: 25%"  border="5" bgcolor="white" -->

		<thead>
			<tr>
				<th align="center" bgcolor="grey"
					style="font-size: 25px; color: white">Customer Details</th>
			</tr>
			<tr>
				<th align="left">Customer ID : ${list3.cus_id}</th>
			</tr>
			<tr>
				<th align="left">Name :${list3.cus_name}</th>
			</tr>
			<tr>
				<th align="left">Age :${list3.cus_age}</th>
			</tr>
			<tr>
				<th align="left">Gender :${list3.cus_gender}</th>
			</tr>
			<tr>
				<th align="left">Email :${list3.cus_email}</th>
			</tr>
			<tr>
				<th align="left">Address :${list3.cus_address}</th>
			</tr>
			<tr>
				<th align="left">Pincode :${list3.cus_pincode}</th>
			</tr>
			<tr>
				<th align="left">Phone number :${list3.cus_phonenumber}</th>
			</tr>
			<tr>
				<th align="left">Aadhar number :${list3.cus_aadharnumber}</th>
			</tr>
		</thead>
		</tbody>
	</table>

</form>
</body>
</html>
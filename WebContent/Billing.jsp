
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
	padding: 2px 2px;
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
</style>

</head>
<!-- %
			String u = (String) request.getSession().getAttribute("Customer ID");
			if (u != null) {
				out.print("welcome!\n Customer ID : " + u);
		
			} 
		/*	else {
				response.sendRedirect("expire.jsp");
			}*/
		%-->

<h1 align="center">Electricity billing system</h1>

<table align="center" style="padding: 3px 40px">
	<tbody>
		<tr>
			<td><button type="button"
					
					style="height: 50px; width: 120px;">My Profile</button></td>

			<td><button type="button"
					onclick="window.location.href='Billing.jsp'"
					style="height: 50px; width: 120px;background-color: silver;">Billing</button></td>

			

			<td><button type="button"
					onclick="window.location.href='index.html'"
					style="height: 50px; width: 100px;">Logout</button></td>



			<!-- td><button type="submit" style="height: 50px; width: 100px;">Logout</button></td-->
		</tr>
	</tbody>
</table>

<h2 align="center" style="padding: 10px 50px">Personal Details</h2>
<form
	action="ExternalServlet"
	method="post">

	<table align="center" style="width: 25%" border="5" bgcolor="white">

		<tbody>

			<tr>
				<th align="center" bgcolor="grey"
					style="font-size: 25px; color: white">Meter Details</th>
			</tr>
			<tr>
				<th align="left">Meter no :${list4.met_no}</th>
			</tr>
			<tr>
				<th align="left">Meter unit :${list4.met_unit}</th>
			</tr>
			<tr>
				<th align="left">Month :${list4.met_month}</th>
			</tr>

			<tr>
				<th align="left">Amount :${list4.met_amount}</th>
			</tr>

			<tr>
				<input align="left" type="hidden" name="paymentAmount"
					id="paymentAmount" value="${list4.met_amount}">

				<input type="hidden" name="retUrl" id="retUrl"
					value="http://localhost:8099/ElectricityBillingSystem/PaymentSuccessful.jsp">


				<!--th align="left">Amount :${list4.met_amount}</th-->
			</tr>

		</tbody>

	</table>
	<br> <br>
	<tr>
		<td><button type="submit"
				style="height: 50px; width: 100px; margin-left: 620px">Pay
				now</button></td>
	</tr>

</form>

</body>
</html>
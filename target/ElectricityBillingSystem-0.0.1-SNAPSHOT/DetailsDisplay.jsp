
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

input[type=Number], input[type=text], input[type=email], select[name=gender] {
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
form{
	display: flex;
	justify-content: space-between;
}

</style>

</head>

<h1 align="center">Electricity billing system</h1>

	<table align="center" style="padding: 1px 10px">
			<tbody>
				<tr>
					<td><button type="button"
							onclick="window.location.href='CircleDetails.jsp'"
							style="height: 50px; width: 100px;">Circle details</button></td>

					<td><button type="button"
							onclick="window.location.href='Consumer.html'"
							style="height: 50px; width: 100px;">Consumer details</button></td>
					<td><button type="button"
							onclick="window.location.href='Meter.html'"
							style="height: 50px; width: 100px;">Meter details</button></td>

<td><button type="button"
							onclick="window.location.href='index.html'"
							style="height: 50px; width: 100px;">Logout</button></td>

					

					<!-- td><button type="submit" style="height: 50px; width: 100px;">Logout</button></td-->
				</tr>
			</tbody>
		</table>

<h2 align="center" style="padding: 10px 50px">Personal Details</h2>
<form action="LogoutServlet" method="post">
<table style="width: 25% "  border="5" bgcolor="white" >
	
		<thead>
		<tr>
						<th align="center" bgcolor="grey" style="font-size: 25px;color: white">Circle Details  </th>
					</tr>
					<tr>
						<th align="left">Circle no 			: ${list.circle_no}</th>
					</tr>
					<tr>
						<th align="left">Circle name 		: ${list.circle_name} </th>
					</tr>
					<tr>
						<th align="left">Division name 		: ${list.division_name}</th>
					</tr>
					
				</thead>
				
	</table>
			
	
	
<table style="width: 25%"  border="5" bgcolor="white" >
	
		<thead>
		<tr>
						<th align="center" bgcolor="grey" style="font-size: 25px;color: white">Customer Details</th>
					</tr>
					<tr>
						<th align="left">Customer ID 		: ${list1.cus_id} </th>
					</tr>
					<tr>
						<th align="left">Name 				:${list1.cus_name}</th>
					</tr>
					<tr>
						<th align="left">Age :${list1.cus_age}</th>
					</tr>
					<tr>
						<th align="left">Gender :${list1.cus_gender}</th>
					</tr>
					<tr>
						<th align="left">Email :${list1.cus_email}</th>
					</tr>
					<tr>
						<th align="left">Address :${list1.cus_address}</th>
					</tr>
					<tr>
						<th align="left">Pincode :${list1.cus_pincode}</th>
					</tr>
					<tr>
						<th align="left">Phone number :${list1.cus_phonenumber}</th>
					</tr>
					<tr>
						<th align="left">Aadhar number :${list1.cus_aadharnumber}</th>
					</tr>
				</thead>
				
	</table>
	<table style="width: 25%"  border="5" bgcolor="white" >
	
		<thead>
		<tr>
						<th align="center" bgcolor="grey" style="font-size: 25px;color: white">Meter Details</th>
					</tr>
					<tr>
						<th align="left">Meter no :${list2.met_no} </th>
					</tr>
					<tr>
						<th align="left">Meter unit :${list2.met_unit}</th>
					</tr>
					<tr>
						<th align="left">Month :${list2.met_month}</th>
					</tr>
					<tr>
						<th align="left">Amount :${list2.met_amount}</th>
					</tr>
					
				</thead>
				
	</table>
<!-- br><br>
<button type="submit" style="height:50px;width: 90px;background-color: #0DF329   ">Payment</button>
<br><br>
<a href="My profile.jsp" style="font-size: 30px">Back</a>
<br><br-->
</form>
</body>
</html>
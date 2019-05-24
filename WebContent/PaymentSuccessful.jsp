<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>payment</title>
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

}**/
</style>
</head>
<button  type="submit"
							onclick="window.location.href='index.html'"
							style="height: 50px; width: 100px; margin-top: 80px 80px; margin-left:1200px">Log out</button>
<h1 align="center" style="padding: 20px 60px; font-style: italic;font-size: 100px; font-family: fantasy;">Payment successful </h1>

<body>
<!--form action="LogoutServlet" method="post"-->
<table align="center" style="width: 25%" border="5" bgcolor="white">

		<tbody>

			<tr>
				<th align="center" bgcolor="grey"
					style="font-size: 25px; color: white">Payment Details</th>
			</tr>
			<tr>
				<th align="left">Account Holder Name:<%out.print( request.getParameter("acc_holder_name")); %></th>
			</tr>
			<tr>
				<th align="left">Transaction Id:<%out.print( request.getParameter("trn_id")); %></th>
			</tr>
			<tr>
				<th align="left">Transaction Status:<%out.print( request.getParameter("trn_status")); %></th>
			</tr>

			

		</tbody>

	</table>
<!--div>
	<div>Account Holder Name: </div><%out.print( request.getParameter("acc_holder_name")); %>
	</div>
		
	<div>
	<div>Transaction Id: </div><%out.print( request.getParameter("trn_id")); %>
	</div>
	<div>
	<div>Transaction Status: </div><%out.print( request.getParameter("trn_status")); %>
	</div-->


</body>
</html>
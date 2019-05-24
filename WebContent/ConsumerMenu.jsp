<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN IN</title>
<style>
body {
	background-image: url('New-areva-10258.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

button {
	background-color: #FFB6C1;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
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
<body>


	<form method="post" action="PersonalDetailsServlet">
	<h1 align="center">Electricity billing system</h1>

	<table align="center" style="padding: 3px 40px">

		<tr>
			<td><button type="submit"
					
					style="height: 50px; width: 120px;">My Profile</button></td>

			<td><button type="button"
					
					style="height: 50px; width: 120px;">Billing Report</button></td>

			<td><button type="button"
					
					style="height: 50px; width: 120px;">Payment</button></td>

			

			<td><button type="submit" style="height: 50px; width: 120px;">Logout</button></td>
		</tr>
		</tbody>
	</table>
	</form>
</body>



</html>
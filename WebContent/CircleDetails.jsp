<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
         background-image: url('New-areva-10258.jpg');
         background-repeat: no-repeat;
         background-size:cover;
         }

input[type=number], input[type=text] {
  width: 100%;
  padding: 9px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #FFB6C1  ;
  color: black;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

/*</style>
<%
/*	response.setHeader("Cache-control", "no-cache");
	response.setHeader("Cache-control", "no-store");
	response.setHeader("pragma", "no-cache");
	//response.setHeader("cache-control",")
	response.setDateHeader("Expires",0);*/
%>
</head>
			<%
		/*	String u = (String)request.getSession().getAttribute("cus_id");
			if (u != null) {
				out.print("welcome  " + u);
		
			} 
		/*	else {
				response.sendRedirect("expire.jsp");
			}*/
		%>
</head>
<body>
<form method="post" action="CircleServlet">
		<h1 align="center">Electricity billing system</h1>
		<table align="center" style="padding: 3px 40px">
			<tbody>
				<tr>
					<td><button type="button"
							onclick="window.location.href='CircleFirst.html'"
							style="height: 50px; width: 100px;background-color: silver;">Circle details</button></td>

					<td><button type="button"
							onclick="window.location.href='Consumer.html'"
							style="height: 50px; width: 100px;" value="hidden">Consumer details</button></td>
							
					<td><button type="button"
							onclick="window.location.href='Meter.html'"
							style="height: 50px; width: 100px;">Meter details</button></td>

					
					<td><button type="submit" style="height: 50px; width: 100px;">Logout</button></td>
				</tr>
			</tbody>
		</table>

		<h1 align="center" style="color: black">Circle Details</h1>
		<table align="center" style="padding: 3px 40px">

			<tr>
				<td><font size="4" color="black" style="background-color: #FFB6C1" >Circle no</font></td>
			</tr>
			<tr>
				<td><input type="number" name="circle_no" placeholder="circle no" max="550" min="1"
					required /></td>
			</tr>
			<tr>
				<td><font size="4" color="black" style="background-color: #FFB6C1">Circle name</font></td>
			</tr>
			<tr>

				<td><input type="text" name="circle_name" placeholder="Circle Name" pattern="[a-z]{1,45}" title="Enter name in character only"
					required /></td>
			</tr>
			<tr>
				<td><font size="4" color="black" style="background-color: #FFB6C1">Division name</font></td>
			</tr>
			<tr>
				<td><input type="text" name="division_name" placeholder="Division name"  pattern="[a-z]{1,45}" title="Enter name in character only"
					required /></td>
			</tr>

			<tr>
				<td><button type="submit" style="height: 50px; width: 100px;">Next</button></td>
			</tr>
		</table>
	</form>

</body>
</html>
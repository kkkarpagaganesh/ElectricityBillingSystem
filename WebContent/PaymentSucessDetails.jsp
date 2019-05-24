<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank you</title>
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
</style>
</head>
<h1 align="center">THANK YOU</h1>
<body>
<form action="index.html" method="post"></form>
<table align="center" style="width: 25%" border="5" bgcolor="white">

		<tbody>

			<tr>
				<th align="center" bgcolor="grey"
					style="font-size: 25px; color: white">Payment Success</th>
			</tr>
			<tr>
				<th align="left">Meter no :${list5.met_no}</th>
			</tr>
			<tr>
				<th align="left">Meter unit :${list5.met_unit}</th>
			</tr>
			<tr>
				<th align="left">Month :${list5.met_month}</th>
			</tr>

			<tr>
				<th align="left">Price :${list5.met_amount}</th>
			</tr>

			</tbody>
			</table>
			
			<br><br>
		<td><button type="submit" onclick="window.location.href='index.html'"
				style="height: 50px; width: 100px; margin-left: 620px">Logout
				</button></td>
	

</body>
</html>
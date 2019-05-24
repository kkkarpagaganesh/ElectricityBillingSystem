<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN IN</title>
<style>
body{
         background-image: url('featured-power_and_energy.jpg');
         background-repeat: no-repeat;
         background-size:cover;
         }

input[type=username], input[type=password] {
  width: 100%;
  padding: 9px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #0DF329    ;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}


</style>
</head>
<body>


	<form method="post" action="EbsLoginController">
	<h1 align="center">Electricity billing system</h1>

		<table align="center" style="padding: 40px 40px">
 
				<tr>
					<td><font size="6">name</font></td>
								</tr>
								<tr>
								<td><input type="username" name="username" required></td>
								</tr>
				<tr>
					<td><font size="6">password</font></td>
				</tr>
				<tr>
				<td><input type="password" name="password" required><br></td>
				</tr>
				<tr>
					<td><button type="submit"  style="height:50px; width:100px;">Login</button></td>
					</tr>
			</tbody>
		</table>
	</form>
</body>



</html>
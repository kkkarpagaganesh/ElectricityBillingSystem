package com.chainsys.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.Connectionutil;

public class Loginvalidation {
	public int loginValidator(int customer_id, String password) throws SQLException {
		int isValid = 1;
		String sql3 = "select customer_id,password from logindetails where customer_id=?";
		Connection connection = Connectionutil.getconnection();
		PreparedStatement preparedstatement = connection.prepareStatement(sql3);
		preparedstatement.setInt(1, customer_id);
		ResultSet rset = preparedstatement.executeQuery();
		if (customer_id == 12345 && password.contentEquals("admin")) {
			isValid = 2;
		} else {
			System.out.println(customer_id);
			if (rset.next()) {
				if (rset.getInt("customer_id") == (customer_id) && rset.getString("password").contentEquals(password)) {
					isValid = 3;
					System.out.println(isValid);
				}
			}
		}
		Connectionutil.close(connection, preparedstatement, null);
		return isValid;
	}
}
package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class UserCheckingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserCheckingServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int consumer_id = Integer.parseInt(request.getParameter("Customer ID"));

		String password = request.getParameter("password");

		Loginvalidation log = new Loginvalidation();

		try {
			int result = log.loginValidator(consumer_id, password);
			if (result == 2) {
				HttpSession session = request.getSession();
				session.setAttribute("consumer_ID", consumer_id);
				RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
				rd.forward(request, response);
			} else if (result == 3) {
				System.out.println(result);
				UserDao userdao = new UserDao();
				User user = new User();
				user.setCus_id(consumer_id);

				User user1 = new User();
				user1 = userdao.Profiledetails(user);

				request.setAttribute("list3", user1);

				RequestDispatcher rd = request.getRequestDispatcher("MyProfile.jsp");
				rd.forward(request, response);

				HttpSession session = request.getSession();
				session.setAttribute("consumer_ID", consumer_id);

			}

		} catch (SQLException e) {

			e.printStackTrace();

			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);

		}
	}

}

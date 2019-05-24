package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class CircleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CircleServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int circle_no = Integer.parseInt(request.getParameter("circle_no"));
		String circle_name = request.getParameter("circle_name");
		String division_name = request.getParameter("division_name");
		UserDao userdao = new UserDao();
		User user = new User();
		user.setCircle_no(circle_no);
		user.setCircle_name(circle_name);
		user.setDivision_name(division_name);
		try {
			boolean status = userdao.Circledetails(user);
			if (status) {
				RequestDispatcher rd = request.getRequestDispatcher("Consumer.html");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("CircleDetails.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}
}

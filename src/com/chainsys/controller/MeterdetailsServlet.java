package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class MeterdetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MeterdetailsServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int consumer_id = (int) session.getAttribute("consumer_ID");
		UserDao userdao = new UserDao();
		User user = new User();
		user.setCus_id(consumer_id);
		User user1 = new User();
		try {
			user1 = userdao.Meterdetails(user);
			request.setAttribute("list4", user1);
			RequestDispatcher rd = request.getRequestDispatcher("Billing.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}
}
package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cus_name = request.getParameter("cus_name");
		int cus_age = Integer.parseInt(request.getParameter("cus_age"));
		String cus_gender = request.getParameter("cus_gender");
		String cus_email = request.getParameter("cus_email");
		String cus_address = request.getParameter("cus_address");
		int cus_pincode = Integer.parseInt(request.getParameter("cus_pincode"));
		long cus_phonenumber = Long.parseLong(request.getParameter("cus_phonenumber"));
		long cus_aadharnumber = Long.parseLong(request.getParameter("cus_aadharnumber"));
		UserDao userdao = new UserDao();
		User user = new User();
		user.setCus_name(cus_name);
		user.setCus_age(cus_age);
		user.setCus_gender(cus_gender);
		user.setCus_email(cus_email);
		user.setCus_address(cus_address);
		user.setCus_pincode(cus_pincode);
		user.setCus_phonenumber(cus_phonenumber);
		user.setCus_aadharnumber(cus_aadharnumber);
		try {
			boolean status = userdao.Consumer(user);
			if (status) {
				RequestDispatcher rd = request.getRequestDispatcher("Meter.html");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("Consumer.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}
}

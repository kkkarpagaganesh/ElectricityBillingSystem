package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class MeterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MeterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int met_no = Integer.parseInt(request.getParameter("met_no"));
		int met_unit = Integer.parseInt(request.getParameter("met_unit"));
		String met_month = request.getParameter("met_month");
		int met_amount = Integer.parseInt(request.getParameter("met_amount"));
		UserDao userdao = new UserDao();
		User user = new User();
		User user1 = new User();
		User user2 = new User();
		user.setMet_no(met_no);
		user.setMet_unit(met_unit);
		user.setMet_month(met_month);
		user.setMet_amount(met_amount);
		try {
			boolean status = userdao.Meter(user);
			if (status) {
				user = userdao.getAllRecords();
				System.out.println(user);
				request.setAttribute("list", user);
				user1 = userdao.getAllRecords1();
				request.setAttribute("list1", user1);
				user2 = userdao.getAllRecords2();
				request.setAttribute("list2", user2);
				RequestDispatcher rd = request.getRequestDispatcher("DetailsDisplay.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("Meter.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}
}

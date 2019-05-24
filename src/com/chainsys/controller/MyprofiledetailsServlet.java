package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class MyprofiledetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyprofiledetailsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDao userdao = new UserDao();
		User user = new User();
		User user1 = new User();
		try {
			user = userdao.getAllRecords();
			System.out.println(user);
			request.setAttribute("list", user);
			user1 = userdao.getAllRecords1();
			request.setAttribute("list1", user1);
			System.out.println("no" + user.getCircle_no());
			RequestDispatcher rd = request.getRequestDispatcher("MyProfile.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

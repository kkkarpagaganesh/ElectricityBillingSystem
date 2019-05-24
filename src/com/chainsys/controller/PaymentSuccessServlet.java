package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

/**
 * Servlet implementation class PaymentSuccessServlet
 */
@WebServlet("/PaymentSuccessServlet")
public class PaymentSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentSuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int consumer_id = (int) session.getAttribute("consumer_ID");
		UserDao userdao = new UserDao();
		User user = new User();
		user.setCus_id(consumer_id);
		User user1 = new User();
		
		try {
			user1 = userdao.Meterdetails(user);
			request.setAttribute("list5", user1);
			RequestDispatcher rd = request.getRequestDispatcher("PaymentSucessDetails.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

}

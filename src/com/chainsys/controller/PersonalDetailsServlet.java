package com.chainsys.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.chainsys.DAO.User;
import com.chainsys.DAO.UserDao;

public class PersonalDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   public PersonalDetailsServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int consumer_id =Integer.parseInt(request.getParameter("Customer ID"));
		UserDao userdao = new UserDao();
		User user=new User();
		user.setCus_id(consumer_id);
		User user1 = new User();
		try {
			user1 = userdao.Profiledetails(user);
		System.out.println("ci"+user1.getCircle_no());
				request.setAttribute("list3", user1);
			
				RequestDispatcher rd = request
						.getRequestDispatcher("MyProfile.jsp");
				rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd = request
					.getRequestDispatcher("ConsumerMenu.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
		}			
}

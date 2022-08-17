package com.mindgate.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId, password;
		userId = request.getParameter("userid");
		password = request.getParameter("userpassword");

		if (userId.equals("admin") && password.equals("baba")) {
			response.sendRedirect("home.html");
		} else {
			response.sendRedirect("invalid.html");

		}
	}

}

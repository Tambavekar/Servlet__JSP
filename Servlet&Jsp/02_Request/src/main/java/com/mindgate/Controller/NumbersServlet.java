package com.mindgate.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumbersServlet")
public class NumbersServlet extends HttpServlet {

	String choice;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.valueOf(request.getParameter("number1"));
		int num2 = Integer.valueOf(request.getParameter("number2"));
		 choice = request.getParameter("oprtn");
		PrintWriter out = response.getWriter();

		switch (choice) {
		case "add": {
			out.println("Addition of " + num1 + "  and  " + num2 + " " + (num1 + num2));
			break;
		}
		case "sub": {
			out.println("Subtraction of " + num1 + "  and  " + num2 + " " + (num1 - num2));
			break;
		}
		}

	}

}

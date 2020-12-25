package AddAndSqr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstAdd extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// This servlet and project is created to tranfer data from one servlet to another.
		// By one of its way RequestDispatcher.
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		// This is how we can set attribute to the request and forward that request through,
		// Request Dispatcher.
		request.setAttribute("k", k);
		RequestDispatcher rd = request.getRequestDispatcher("square");
		rd.forward(request, response);
	}
}

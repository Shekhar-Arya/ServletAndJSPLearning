package WebServletAnnotationExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAnnotaion
 */

// This annotation will do the work of mapping of servlet pages and index pages
// With the  help of this we dont need to map this class with index in web.xml file.
@WebServlet("/add")
public class ServletAnnotaion extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		response.getWriter().println("Answer is : "+k);
	}

}

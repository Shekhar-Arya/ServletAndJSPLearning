package HttpSessionExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstHttpSessionClass
 */
@WebServlet("/add")
public class FirstHttpSessionClass extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		
		// This is example of passing values from one servlet to another.
		// This time its done by redirect method with  Http session 
		HttpSession session = request.getSession();
		session.setAttribute("k", k);
		response.sendRedirect("square");
	}


}

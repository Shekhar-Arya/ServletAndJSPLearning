package URLRedirectExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServletForURL
 */
@WebServlet("/sqr")
public class SecondServletForURL extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int k = Integer.parseInt(request.getParameter("k"));
		k=k*k;
		response.getWriter().println("Answer is : "+k);
	}


}

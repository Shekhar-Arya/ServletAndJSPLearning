package AddAndSqr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondSquare extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// This is how we get attribute which is set in different servlet.
		// Mapping for first and second both is done in web.xml
		int k = (int)request.getAttribute("k");
		k = k*k;
		response.getWriter().println("This output is from SecondServlet Answer is : "+k);
	}
}

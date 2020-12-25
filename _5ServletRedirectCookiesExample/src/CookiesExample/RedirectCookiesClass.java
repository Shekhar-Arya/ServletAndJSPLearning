package CookiesExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectCookiesClass
 */
@WebServlet("/add")
public class RedirectCookiesClass extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		
		// This is another example of passing values between servlet.
		// With the help of Cookies
		
		Cookie cookies = new Cookie("k",k+"");
		response.addCookie(cookies);
		response.sendRedirect("square");
	}

}

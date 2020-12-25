package CookiesExample;

import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondCookieClassToDisplay
 */
@WebServlet("/square")
public class SecondCookieClassToDisplay extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int k = 0;
		Cookie[] cookie = request.getCookies();
		for(Cookie c : cookie)
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		response.getWriter().println("Answer from CookieExample is : "+k);
	}

}

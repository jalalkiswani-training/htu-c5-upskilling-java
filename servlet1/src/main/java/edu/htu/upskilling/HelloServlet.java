package edu.htu.upskilling;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("name");
		response.getWriter().append("Hello "+parameter);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password=request.getParameter("password");
		if(username!=null && username.trim().equals("admin")) {
			if(password!=null && password.trim().equals("123456")) {
				//response.getWriter().append("Welcome, "+username);
				request.getSession().setAttribute("currentUser", username);
				response.sendRedirect("home.jsp");
				return;
			}
		}
		//response.getWriter().append("Invalid Username or password");
		//("login.jsp?msg=Invalid username or password");
		request.setAttribute("msg", "Invalid usernanme or password");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}

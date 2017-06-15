 package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userDAO;
import model.users;



 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("LoginServlet");
		
	
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		
		out.println("email="+ email);
		out.println("password="+ password);

		userDAO userDAO =new userDAO();
		
		
		
		try {
			users u= userDAO.login(email,password);
			out.println(u);
			if (u==null)
			{
				response.sendRedirect("login.html");
			}
			else
			{
				response.sendRedirect("listbook.html");
				response.sendRedirect("success.html");
	}
										
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

		
	
		
		
		
	}

		

	
}

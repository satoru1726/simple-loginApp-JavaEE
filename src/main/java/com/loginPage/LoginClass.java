package com.loginPage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import com.loginDAO.LoginDAOClass;

@WebServlet("/loginPage")
public class LoginClass extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("uName");
		String password = request.getParameter("pass");
		HttpSession session = request.getSession();
		session.setAttribute("uName", userName);
	
		LoginDAOClass dao = new LoginDAOClass();

		if(dao.checkLogin(userName, password)){
			response.sendRedirect("welcomePage.jsp");
		}
	    else {
		response.sendRedirect("loginPage.jsp");
	    }
	}
}

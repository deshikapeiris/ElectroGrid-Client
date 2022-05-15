package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginAPI")
public class LoginAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	User userObj = new User();
	
	
    public LoginAPI() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
			{ 
			 HttpSession session = request.getSession(); 
			 String authStatus = userObj.login(request.getParameter("txtuserName"), 
			 request.getParameter("txtPassword")); 
			 String output = ""; 
			if (authStatus.equals("success")) 
			 { 
			 output = "{\"status\":\"success\", \"data\": \"\"}"; 
			 session.setAttribute("UserName", 
			 request.getParameter("txtuserName"));
			 } 
			else
			 { 
			 output = "{\"status\":\"error\", \"data\": \"" + authStatus + "\"}"; 
			 } 
			 response.getWriter().write(output); 
			}


}

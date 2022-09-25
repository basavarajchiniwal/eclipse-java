package com.xworkz.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(loadOnStartup = 14, urlPatterns = "/company")
public class CompanyServlet extends HttpServlet {
	public CompanyServlet() {
		System.out.println("default constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service started");
		
		String Name = req.getParameter("alias");
		String Company = req.getParameter("company");
		String Salary = req.getParameter("salary");
		System.out.println(Name);
		System.out.println(Company);
		System.out.println(Salary);
		
		resp.setContentType("text/html");
		PrintWriter  pw= resp.getWriter(); 
		pw.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("person Details")
		.append("</h1>")
		.append(Name)
		.append(Company)
		.append(Salary)
		.append("</body>")
		.append("</html>");

	}
}

package com.xworkz.primeminister;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 10,urlPatterns = "/pm")
public class PrimeMinisterServlet extends HttpServlet {

	public PrimeMinisterServlet() {
		System.out.println("Default Construcor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String world = req.getParameter("country");
		String status = req.getParameter("marriage");
		String party1 = req.getParameter("party");
		String age1 = req.getParameter("age");
		String gender1 = req.getParameter("gen");
		String period = req.getParameter("time");
		String rep = req.getParameter("rep");

		req.setAttribute("Name", name);
		req.setAttribute("world", world);
		req.setAttribute("status", status);
		req.setAttribute("party1", party1);
		req.setAttribute("age1", age1);
		req.setAttribute("gender1", gender1);
		req.setAttribute("period", period);
		req.setAttribute("rep", rep);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Success.jsp");
		dispatcher.forward(req, resp);

	}

}

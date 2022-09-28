package com.xworkz.registration;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 12, urlPatterns = ("/application"))
public class JobApplicationServlet extends HttpServlet {
	
	private List <RegistrationDto> dtos = new ArrayList ();
	
	
	public JobApplicationServlet() {
		System.out.println(this.getClass().getSimpleName());
		
	}
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("The server is started");
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNo = req.getParameter("phoneno");
		String altPhNo = req.getParameter("altPhno");
		String gender = req.getParameter("gen");
		String qualification = req.getParameter("qualification");
		String yop = req.getParameter("yop");
		String university = req.getParameter("University");
		String address = req.getParameter("address");
		String skills = req.getParameter("skills");
		String j1 = req.getParameter("skills1");
		String j2 = req.getParameter("skills2");
		String j3 = req.getParameter("skills3");
		String j4 = req.getParameter("skills4");
		String j5 = req.getParameter("skills5");
		String j6 = req.getParameter("skills6");
		String j7 = req.getParameter("skills7");
		String j8 = req.getParameter("skills8");
		String j9 = req.getParameter("skills9");
		String j10 = req.getParameter("skills10");
		String j11 = req.getParameter("skills11");
		String j12 = req.getParameter("skills12");
		String j13 = req.getParameter("skills13");
		String j14 = req.getParameter("skills14");
		String salary = req.getParameter("salary");
		String experience = req.getParameter("experience");
		String idProof = req.getParameter("idproof");
		String idProofNo = req.getParameter("idProofNo");
		
		System.out.println("Name :"+name);
		System.out.println("E-mail :"+email);
		System.out.println("phoneno :"+phoneNo);
		System.out.println("altPhno :"+altPhNo);
		System.out.println("gen :"+gender);
		System.out.println("qualification :"+qualification);
		System.out.println("yop :"+yop);
		System.out.println("University :"+university);
		System.out.println("address :"+address);
		System.out.println("skills :"+skills);
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		System.out.println(j4);
		System.out.println(j5);
		System.out.println(j6);
		System.out.println(j7);
		System.out.println(j8);
		System.out.println(j9);
		System.out.println(j10);
		System.out.println(j11);
		System.out.println(j12);
		System.out.println(j13);
		System.out.println(j14);
		System.out.println("salary :"+salary);
		System.out.println("exp :"+experience);
		System.out.println("idproof :"+idProof);
		System.out.println("idProofNo :"+idProofNo);
		
		PrintWriter w  =res.getWriter();
		w.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Registration is successfull below are the details")
		.append("</h1>")
		.append("Name "+name).append("<br/>")
		.append("E-mail :"+email).append("<br/>")
		.append("phoneno :"+phoneNo).append("<br/>")
		.append("altPhno :"+altPhNo).append("<br/>")
		.append("gen :"+gender).append("<br/>")
		.append("qualification :"+qualification).append("<br/>")
		.append("yop :"+yop).append("<br/>")
		.append("University :"+university).append("<br/>")
		.append("address :"+address).append("<br/>")
			
		.append("skills :"+skills).append("<br/>")
		.append(j1).append("<br/>")
		.append(j2).append("<br/>")
		.append(j3).append("<br/>")
		.append(j4).append("<br/>")
		.append(j5).append("<br/>")
		.append(j6).append("<br/>")
		.append(j7).append("<br/>")
		.append(j8).append("<br/>")
		.append(j9).append("<br/>")
		.append(j10).append("<br/>")
		.append(j11).append("<br/>")
		.append(j12).append("<br/>")
		.append(j13).append("<br/>")
		.append(j14).append("<br/>")
		.append("salary :"+salary).append("<br/>")
		.append("exp :"+experience).append("<br/>")
		.append("idproof :"+idProof).append("<br/>")
		.append("idProofNo :"+idProofNo).append("<br/>")
		.append("</body>")
		.append("</html>");
		
		RegistrationDto dto = new RegistrationDto(name,email,Long.parseLong(phoneNo),
				Long.parseLong(altPhNo),gender,qualification,Integer.parseInt(yop),university,
				address,skills,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,Double.parseDouble(salary),
				Integer.parseInt(experience),idProof,idProofNo);
		dtos.add(dto);
		
		
	}
	
	

}
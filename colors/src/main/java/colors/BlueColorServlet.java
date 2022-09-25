package colors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 10,urlPatterns = "/bluecolor")
public class BlueColorServlet extends HttpServlet {
	public BlueColorServlet() {
		System.out.println("def contructor");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.service(req, resp);
		resp.setContentType("text/html");
		PrintWriter color1 = resp.getWriter();

				color1.append("<html><body  bgcolor='blue'><h1 style='color:black;'>" + "Edu Neeli")
				.append("</h1></body></html>");
	}

}

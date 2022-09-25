package colors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 10, urlPatterns = "/greencolors")

public class ColorServlet extends HttpServlet {
	public ColorServlet() {
		System.out.println("Default constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.service(req, resp);
		resp.setContentType("text/html");
		PrintWriter color = resp.getWriter();

		color.append("<html><body  bgcolor='green'><h1 style='color:black;'>".concat( "Edu hasiru"))
				.append("</h1></body></html>");

	}
}

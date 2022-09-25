package colors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 12, urlPatterns = "/blackcolor")
public class BlackColorServlet extends HttpServlet {
	public BlackColorServlet() {
		System.out.println("default contructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter color2 = resp.getWriter();

				color2.append("<html><body  bgcolor='black'><h1 style='color:white;'>"+ "Edu Kappu")
				.append("</h1></body></html>");

	}

}

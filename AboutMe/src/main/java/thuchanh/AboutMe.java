package thuchanh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet(description = "Intro Yourself", urlPatterns = { "/AboutMe" })
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//head
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter traVe = response.getWriter();

		traVe.println("<h1>About Me</h1>");
		traVe.println("<p>Ten: Nguyen Ngoc Hoai Sang</p>");
		traVe.println("<p>Lop: 62_CNTT_CLC</p>");
		traVe.println("<p>MSSV: 62133231</p>");
		traVe.println("<p>Email: sang.nnh.62cntt@ntu.edu.vn</p>");
		traVe.println("<p>Phone: 0376354610</p>");

	}

}

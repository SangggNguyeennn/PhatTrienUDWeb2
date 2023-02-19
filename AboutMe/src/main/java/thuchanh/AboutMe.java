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

		traVe.println("<h1 style=\"width:140px;rotate:-90deg;margin-top: 70px;\">About Me</h1>");
//		traVe.println("<img src=\"Image/ms.png\" alt=\"My Image\">");
		traVe.println("<p style=\"margin-top:-100px;margin-left:110px;\">Ten: Nguyen Ngoc Hoai Sang</p>");
		traVe.println("<p style=\"margin-left:110px;\">Lop: 62_CNTT_CLC</p>");
		traVe.println("<p style=\"margin-left:275px;margin-top:-35px;\">MSSV: 62133231</p>");
		traVe.println("<p style=\"margin-left:110px;\">Email: sang.nnh.62cntt@ntu.edu.vn</p>");
		traVe.println("<p style=\"margin-left:110px;\">Phone: 0376354610</p>");

	}

}

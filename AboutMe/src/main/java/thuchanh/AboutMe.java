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

		traVe.println("<h1>NHA TRANG UNIVERSITY</h1>");
		traVe.println("<h1 style=\"width:196px;rotate:-90deg;margin-top: 70px;border-bottom:solid;margin-left:-30px;\">About Me</h1>");
//		traVe.println("<img src=\"Image/ms.png\" alt=\"My Image\">");
		traVe.println("<h3 style=\"margin-top:-100px;margin-left:113px;\">Nguyen Ngoc Hoai Sang</h3>");
		traVe.println("<p style=\"margin-left:113px;\">62_CNTT_CLC</p>");
		traVe.println("<p style=\"margin-left:240px;margin-top:-35px;\">62133231</p>");
		traVe.println("<p style=\"margin-left:113px;\">sang.nnh.62cntt@ntu.edu.vn</p>");
		traVe.println("<p style=\"margin-left:113px;\">0376354610</p>");
		traVe.println("<p style=\"margin-left:88px;border-bottom:solid;padding-left:25px;margin-top:-6px;width:285px;border-right:solid;\">https://www.facebook.com/helloimcharone/</p>");

	}

}

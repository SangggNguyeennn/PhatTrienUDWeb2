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
		
		//body
		String noiDungHTML;
		noiDungHTML = "<center><h1>SOMETHING ABOUT ME</h1>";
		noiDungHTML += "<h2>ABC</h2>";
		noiDungHTML += "<p><font color=red size=20px> HELLO 62_CNTT_CLC_CTU </font></p>";
		
		PrintWriter traVe = response.getWriter();
		traVe.append(noiDungHTML);
	}

}

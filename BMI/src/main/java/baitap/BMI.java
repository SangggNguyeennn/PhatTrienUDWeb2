package baitap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter traVe = response.getWriter();
		traVe.append("Ban vua gui yeu cau dang GET, day la dap ung cua toi ");
		String noiDungHTML = "<form method = POST action=\"ViduHelloWordServlet/Bai1_2\""
				+ "<label>Chieu cao:</label>"
				+ "<input type=\"text\"name=\"fname\"><br>\r\n"
				+ "<label>Can nang:</label>"
				+ "<input type=\"text\"name=\"lname\"><br>"
				+ "<input type=\"submit\"value=\"Tinh BMI\">"
				+ "</form>";
		traVe.append(noiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String value1 = request.getParameter("fname");
		String value2 = request.getParameter("lname");
		PrintWriter traVe = response.getWriter();
		traVe.append("Ban vua gui yeu cau dang POST, day la dap ung cua toi");
		traVe.append("Gia tri tham so fname = ");
		traVe.append(value1);
		traVe.append("\nGia tri tham so lname = ");
		traVe.append(value2);
	}

}

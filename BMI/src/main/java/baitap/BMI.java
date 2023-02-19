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
		traVe.println("Tinh BMI");
		String noiDungHTML = "<form method = POST action=\"BMI\""
				+ "<label>Nhap chieu cao:</label>"
				+ "<input type=\"text\"name=\"height\"><br>\r\n"
				+ "<label>Nhap can nang:</label>"
				+ "<input type=\"text\"name=\"weight\"><br>"
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

		PrintWriter traVe = response.getWriter();
		String weightStr = request.getParameter("weight");
		String heightStr = request.getParameter("height");

		float weight = Float.parseFloat(weightStr);
		float height = Float.parseFloat(heightStr);
		
		float bmi = weight / (height * height);
		
		traVe.println("Chieu cao cua ban la: " + height );
		traVe.println("\nCan nang cua ban la: " + weight );
		traVe.println("\nBMI = " + bmi );
	}

}

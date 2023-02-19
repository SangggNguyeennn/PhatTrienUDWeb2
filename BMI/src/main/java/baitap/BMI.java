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
		traVe.println("<h1>Tinh BMI</h1>");
		String noiDungHTML = "<form method = POST action=\"BMI\""
				+ "<label>Nhap chieu cao:</label>"
				+ "<input style=\"margin-left: 15px;\" type=\"text\"name=\"height\"><br>\r\n"
				+ "<label>Nhap can nang:</label>"
				+ "<input style=\"margin-left: 19px;\" type=\"text\"name=\"weight\"><br>"
				+ "<input style=\"margin-top:20px;margin-left:90px;width:70px;height:30px;\" type=\"submit\"value=\"Tinh\">"
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
		
		traVe.println("Chieu cao cua ban la: " + height);
		traVe.println("\nCan nang cua ban la: " + weight );
		traVe.println("\nBMI = " + bmi );
		
		if(bmi<18.5) {
			traVe.println("<p>Gay</p>");
		}
		if(bmi>18.5 && bmi<24.9) {
			traVe.println("<p>Binh Thuong</p>");
		}
		if(bmi>25 && bmi<29.9) {
			traVe.println("<p>Hoi Beo</p>");
		}
		if(bmi>30 && bmi<34.9) {
			traVe.println("<p>Beo Phi Cap Do 1</p>");
		}
		if(bmi>35 && bmi<39.9) {
			traVe.println("<p>Beo Phi Cap Do 2</p>");
		}
		if(bmi>40) {
			traVe.println("<p>Beo Phi Cap Do 3</p>");
		}
		
	}

}

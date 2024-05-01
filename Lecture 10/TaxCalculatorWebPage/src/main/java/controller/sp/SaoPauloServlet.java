package controller.sp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/saopaulo")
public class SaoPauloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SaoPauloCityTax cityTax;

	public SaoPauloServlet() {
		cityTax = new SaoPauloCityTax();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float areaTotal = Float.parseFloat(request.getParameter("areatotal"));
		int roomNumber = Integer.parseInt(request.getParameter("roomnumber"));

		cityTax.setAreaTotal(areaTotal);
		cityTax.setRoomNumber(roomNumber);
		request.setAttribute("taxvalue", cityTax.computeTax());

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

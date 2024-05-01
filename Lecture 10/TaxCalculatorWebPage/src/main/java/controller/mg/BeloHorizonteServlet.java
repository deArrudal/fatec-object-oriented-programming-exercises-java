package controller.mg;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/belohorizonte")
public class BeloHorizonteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BeloHorizonteCityTax cityTax;

	public BeloHorizonteServlet() {
		cityTax = new BeloHorizonteCityTax();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float areaTotal = Float.parseFloat(request.getParameter("areatotal"));
		int bedroomNumber = Integer.parseInt(request.getParameter("bedroomnumber"));

		cityTax.setAreaTotal(areaTotal);
		cityTax.setBedroomNumber(bedroomNumber);
		request.setAttribute("taxvalue", cityTax.computeTax());

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

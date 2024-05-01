package controller.rs;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/portoalegre")
public class PortoAlegreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PortoAlegreCityTax cityTax;

	public PortoAlegreServlet() {
		cityTax = new PortoAlegreCityTax();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float areaTotal = Float.parseFloat(request.getParameter("areatotal"));
		float areaGarage = Float.parseFloat(request.getParameter("areagarage"));

		cityTax.setAreaTotal(areaTotal);
		cityTax.setAreaGarage(areaGarage);
		request.setAttribute("taxvalue", cityTax.computeTax());

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

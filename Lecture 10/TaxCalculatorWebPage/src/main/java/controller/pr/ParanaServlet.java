package controller.pr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/parana")
public class ParanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ParanaCityTax cityTax;

	public ParanaServlet() {
		cityTax = new ParanaCityTax();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float areaTotal = Float.parseFloat(request.getParameter("areatotal"));
		int estateAge = Integer.parseInt(request.getParameter("estateage"));

		cityTax.setAreaTotal(areaTotal);
		cityTax.setEstateAge(estateAge);
		request.setAttribute("taxvalue", cityTax.computeTax());

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

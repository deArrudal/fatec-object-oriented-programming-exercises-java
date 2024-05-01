package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setinput")
public class SetInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetInputServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String city = (String) getServletContext().getAttribute("city");

		RequestDispatcher rd;
		switch (city) {
		case "Sao Paulo":
			rd = request.getRequestDispatcher("saopaulo");
			rd.forward(request, response);
			break;
		case "Belo Horizonte":
			rd = request.getRequestDispatcher("belohorizonte");
			rd.forward(request, response);
			break;
		case "Porto Alegre":
			rd = request.getRequestDispatcher("portoalegre");
			rd.forward(request, response);
			break;
		case "Parana":
			rd = request.getRequestDispatcher("parana");
			rd.forward(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

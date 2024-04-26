package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import model.*;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AccountServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer accountId = Integer.parseInt(request.getParameter("accountId"));
		HashMap<Integer, Account> accounts = (HashMap<Integer, Account>) getServletContext().getAttribute("accounts");
		boolean validAccount = accounts.containsKey(accountId);

		request.setAttribute("validAccount", validAccount);
		getServletContext().setAttribute("accountId", accountId);

		if (!validAccount) {
			RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
			rd.forward(request, response);

		} else {
			String accountType = accounts.get(accountId).getAccountType();
			RequestDispatcher rd;

			switch (accountType) {
			case "saving":
				rd = request.getRequestDispatcher("savingaccount.jsp");
				rd.forward(request, response);
				break;
			case "special":
				rd = request.getRequestDispatcher("specialaccount.jsp");
				rd.forward(request, response);
				break;
			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

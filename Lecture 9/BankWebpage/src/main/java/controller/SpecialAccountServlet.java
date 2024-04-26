package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/special")
public class SpecialAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SpecialAccountServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer accountId = (Integer) getServletContext().getAttribute("accountId");
		HashMap<Integer, Account> accounts = (HashMap<Integer, Account>) getServletContext().getAttribute("accounts");

		String transaction = request.getParameter("transaction");
		switch (transaction) {
		case "Deposit":
			float valueDeposit = Float.parseFloat(request.getParameter("valueDeposit"));
			accounts.get(accountId).deposit(valueDeposit);
			break;
		case "Withdraw":
			float valueWithdraw = Float.parseFloat(request.getParameter("valueWithdraw"));
			accounts.get(accountId).withdraw(valueWithdraw);
			break;
		case "Balance":
		}

		getServletContext().setAttribute("accounts", accounts);

		String accountBalance = accounts.get(accountId).toString();
		request.setAttribute("accountBalance", accountBalance);

		RequestDispatcher rd = request.getRequestDispatcher("savingaccount.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

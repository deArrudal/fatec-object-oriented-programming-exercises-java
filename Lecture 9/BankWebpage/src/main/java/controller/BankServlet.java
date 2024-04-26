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

@WebServlet("/bank")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HashMap<Integer, Account> accounts;

	public BankServlet() {
		accounts = new HashMap<>();
		setAccount();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().setAttribute("accounts", accounts);
		RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void setAccount() {
		// Fixed values.
		SavingAccount savingaccount = new SavingAccount(1, "John Doe", 1500.00f, 15, false);
		accounts.put(savingaccount.getAccountId(), savingaccount);

		SpecialAccount specialaccount = new SpecialAccount(2, "Jane Doe", 3000.00f, 1000.00f);
		accounts.put(specialaccount.getAccountId(), specialaccount);
	}

}

package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.exception.AccountNotFoundException;
import com.example.exception.BalanceException;
import com.example.repository.JdbcAccountRepository;
import com.example.service.IMPSTxrService;
import com.example.service.TxrService;

@WebServlet(urlPatterns = { "/txr" })
public class TxrServlet extends HttpServlet {

	TxrService txrService = new IMPSTxrService(new JdbcAccountRepository());

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fromAccNum = req.getParameter("fromAccNum");
		String toAccNum = req.getParameter("toAccNum");
		double amount = Double.parseDouble(req.getParameter("amount"));

		String message = "";

		try {
			boolean b = txrService.txr(amount, fromAccNum, toAccNum);
			if (b) {
				message = "Txr success : " + LocalDateTime.now();
			} else {
				message = "Txr Failed  : " + LocalDateTime.now();
			}
		} catch (AccountNotFoundException e) {
			message = e.getMessage();
		} catch (BalanceException e) {
			message = e.getMessage();
		}

		req.setAttribute("message", message);
		req.getRequestDispatcher("txr-status.jsp").forward(req, resp);

	}

}

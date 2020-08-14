package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.repository.JdbcAccountRepository;
import com.example.service.IMPSTxrService;
import com.example.service.TxrService;

@WebServlet(urlPatterns = { "/txr" })
public class TxrServlet extends HttpServlet {
	
	TxrService txrService=new IMPSTxrService(new JdbcAccountRepository());

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fromAccNum = req.getParameter("fromAccNum");
		String toAccNum = req.getParameter("toAccNum");
		double amount = Double.parseDouble(req.getParameter("amount"));
		
		txrService.txr(amount, fromAccNum, toAccNum);
		
		
		PrintWriter out=resp.getWriter();
		out.print("Txr successfull");

	}

}

package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.exception.BalanceException;
import com.example.demo.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@PostMapping(value = "txr")
	public String txr(
			Model model, 
			@RequestParam String fromAccNum, 
			@RequestParam String toAccNum,
			@RequestParam double amount) {

		System.out.println(fromAccNum);
		System.out.println(toAccNum);
		System.out.println(amount);

		// initiate txr...
		boolean b = txrService.txr(amount, fromAccNum, toAccNum);

		String message = "";
		if (b) {
			message = "Transfer Success";
		} else {
			message = "Transfer Failed";
		}

		model.addAttribute("message", message);

		return "txr-status";

	}

	@ExceptionHandler(value = { BalanceException.class, AccountNotFoundException.class })
	public String handleExcpetion(Exception ex, Model model) {
		model.addAttribute("message", ex.getMessage());
		return "txr-status";
	}

}

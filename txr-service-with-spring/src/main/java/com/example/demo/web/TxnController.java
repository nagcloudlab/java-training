package com.example.demo.web;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Txn;

@Controller
public class TxnController {

	@GetMapping(value = "txns")
	public String getAllTxns(@RequestParam String filter, Model model) {

		List<Txn> txns = new ArrayList<Txn>();
		if (filter.equals("all")) {
			txns.add(new Txn(1, 100.00, LocalDateTime.now(), "sample txn1"));
			txns.add(new Txn(2, 200.00, LocalDateTime.now(), "sample txn2"));
		}

		model.addAttribute("txns", txns); // request scope

		return "statement";

	}

}

package com.ilending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilending.service.LoanRequestService;

@Controller
public class LenderController {

	@Autowired
	LoanRequestService loanRequestService;
	
	@RequestMapping("/lender/dashboard")
	public String lenderHome(ModelMap model) {
		model.put("total_opportunities", loanRequestService.getCountLoanRequest());
		return "lender";
	}
}

package com.ilending.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilending.dao.LoanRequestRepository;

@Service
public class LoanRequestService {

	@Autowired
	private LoanRequestRepository loanRequestRepository;
	
	public int getCountLoanRequest() {
		return (int) loanRequestRepository.count();
	}
}

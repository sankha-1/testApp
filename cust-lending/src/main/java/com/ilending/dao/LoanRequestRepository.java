package com.ilending.dao;

import org.springframework.data.repository.CrudRepository;

import com.ilending.model.LoanRequest;

public interface LoanRequestRepository extends CrudRepository<LoanRequest, Integer>{

}

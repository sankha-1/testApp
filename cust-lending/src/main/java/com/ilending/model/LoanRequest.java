package com.ilending.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="lr_loan_request")
public class LoanRequest {
	
	@Id
	private int loanRequestId;
	private float amountRequested;
	private float interestRate;
	private float previousInterestRate;
	private int tenureRequested;
	private int customerId;
	private String customerLoanRating;
	private Date dateRequested;
	private Date maxDateForFunding;
	private float systemInterestRateLow;
	private float systemInterestRateHigh;
	private Date dateInterestRateChanged;
	private float totalCommittedAmount;
	private String loanRequestStatus;
	
	public LoanRequest() {
		
	}
	
	public LoanRequest(int loanRequestId, float amountRequested, float interestRate, float previousInterestRate,
			int tenureRequested, int customerId, String customerLoanRating, Date dateRequested, Date maxDateForFunding,
			float systemInterestRateLow, float systemInterestRateHigh, Date dateInterestRateChanged,
			float totalCommittedAmount, String loanRequestStatus) {
		super();
		this.loanRequestId = loanRequestId;
		this.amountRequested = amountRequested;
		this.interestRate = interestRate;
		this.previousInterestRate = previousInterestRate;
		this.tenureRequested = tenureRequested;
		this.customerId = customerId;
		this.customerLoanRating = customerLoanRating;
		this.dateRequested = dateRequested;
		this.maxDateForFunding = maxDateForFunding;
		this.systemInterestRateLow = systemInterestRateLow;
		this.systemInterestRateHigh = systemInterestRateHigh;
		this.dateInterestRateChanged = dateInterestRateChanged;
		this.totalCommittedAmount = totalCommittedAmount;
		this.loanRequestStatus = loanRequestStatus;
	}
	
	public int getLoanRequestId() {
		return loanRequestId;
	}
	public void setLoanRequestId(int loanRequestId) {
		this.loanRequestId = loanRequestId;
	}
	public float getAmountRequested() {
		return amountRequested;
	}
	public void setAmountRequested(float amountRequested) {
		this.amountRequested = amountRequested;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public float getPreviousInterestRate() {
		return previousInterestRate;
	}
	public void setPreviousInterestRate(float previousInterestRate) {
		this.previousInterestRate = previousInterestRate;
	}
	public int getTenureRequested() {
		return tenureRequested;
	}
	public void setTenureRequested(int tenureRequested) {
		this.tenureRequested = tenureRequested;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerLoanRating() {
		return customerLoanRating;
	}
	public void setCustomerLoanRating(String customerLoanRating) {
		this.customerLoanRating = customerLoanRating;
	}
	public Date getDateRequested() {
		return dateRequested;
	}
	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}
	public Date getMaxDateForFunding() {
		return maxDateForFunding;
	}
	public void setMaxDateForFunding(Date maxDateForFunding) {
		this.maxDateForFunding = maxDateForFunding;
	}
	public float getSystemInterestRateLow() {
		return systemInterestRateLow;
	}
	public void setSystemInterestRateLow(float systemInterestRateLow) {
		this.systemInterestRateLow = systemInterestRateLow;
	}
	public float getSystemInterestRateHigh() {
		return systemInterestRateHigh;
	}
	public void setSystemInterestRateHigh(float systemInterestRateHigh) {
		this.systemInterestRateHigh = systemInterestRateHigh;
	}
	public Date getDateInterestRateChanged() {
		return dateInterestRateChanged;
	}
	public void setDateInterestRateChanged(Date dateInterestRateChanged) {
		this.dateInterestRateChanged = dateInterestRateChanged;
	}
	public float getTotalCommittedAmount() {
		return totalCommittedAmount;
	}
	public void setTotalCommittedAmount(float totalCommittedAmount) {
		this.totalCommittedAmount = totalCommittedAmount;
	}
	public String getLoanRequestStatus() {
		return loanRequestStatus;
	}
	public void setLoanRequestStatus(String loanRequestStatus) {
		this.loanRequestStatus = loanRequestStatus;
	}
		
}

package com.voyager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

	@JsonProperty("customer_id")
	private String customerId;
	
	@JsonProperty("account_number")
	private String accountNumber;
	
	@JsonProperty("account_type")
	private String accountType;
	
	@JsonProperty("LBalance")
	private String ledgerBalance;
	
	@JsonProperty("ABalance")
	private String availableBalance;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getLedgerBalance() {
		return ledgerBalance;
	}

	public void setLedgerBalance(String ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", ledgerBalance=" + ledgerBalance + ", availableBalance=" + availableBalance + "]";
	}
	
	
}

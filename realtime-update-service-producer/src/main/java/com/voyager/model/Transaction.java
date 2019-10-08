package com.voyager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

	@JsonProperty("transaction_id")
	private String transactionId;
	
	@JsonProperty("account_number")
	private String accountNumber;
	
	@JsonProperty("transaction_type")
	private String transaction_type;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("amount")
	private Double amount;
	
	@JsonProperty("date")
	private String date;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNumber=" + accountNumber
				+ ", transaction_type=" + transaction_type + ", description=" + description + ", amount=" + amount
				+ ", date=" + date + "]";
	}
	
	
}

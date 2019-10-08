package com.voyager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	@JsonProperty("customer_id")
	private String customerId;
	
	@JsonProperty("firstname")
	private String firstName;
	
	@JsonProperty("lastname")
	private String lastName;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("dob")
	private String dob;
	
	@JsonProperty("nationality")
	private String nationality;
	
	@JsonProperty("passport_number")
	private String passportNumber;
	
	@JsonProperty("number_of_dependents")
	private Double numberOfDependents;
	
	@JsonProperty("marital_status")
	private String maritalStatus;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Double getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(Double numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dob=" + dob + ", nationality=" + nationality + ", passportNumber="
				+ passportNumber + ", numberOfDependents=" + numberOfDependents + ", maritalStatus=" + maritalStatus
				+ "]";
	}
	
	
}

package com.voyager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactInfo {

	@JsonProperty("customer_id")
	private String customerId;
	
	@JsonProperty("phone_no")
	private String phoneNo;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("address")
	private Address address;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ContactInfo [customerId=" + customerId + ", phoneNo=" + phoneNo + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
}

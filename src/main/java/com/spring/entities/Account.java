package com.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account implements Serializable {
	@Id
	@GeneratedValue
	private long accountNumber;
	private long routingNumber;
	private String accountHoldeFirstName;
	private String accountHoldeLastName;
	private String address1;
	private String city;
	private int zipCode;
	private String phoneNumber;
	private String email;
	private float amount;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(long routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountHoldeFirstName() {
		return accountHoldeFirstName;
	}

	public void setAccountHoldeFirstName(String accountHoldeFirstName) {
		this.accountHoldeFirstName = accountHoldeFirstName;
	}

	public String getAccountHoldeLastName() {
		return accountHoldeLastName;
	}

	public void setAccountHoldeLastName(String accountHoldeLastName) {
		this.accountHoldeLastName = accountHoldeLastName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}

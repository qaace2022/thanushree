package bankproject;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bank {
	Admin admin;
	String bankName;
	List<Customers> customers;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<Customers> getCustomers
	() {
		return customers;
	}
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

}

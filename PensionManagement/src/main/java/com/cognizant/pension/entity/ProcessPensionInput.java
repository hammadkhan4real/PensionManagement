package com.cognizant.pension.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProcessPensionInput {
	
	@Id
	private String aadhaarNumber;

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	} 

}

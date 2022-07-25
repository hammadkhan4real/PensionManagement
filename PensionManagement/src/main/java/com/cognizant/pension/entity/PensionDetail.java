package com.cognizant.pension.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PensionDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pensionDetailId;
	private double pensionAmount;
	private double bankServiceCharge;
	public int getPensionDetailId() {
		return pensionDetailId;
	}
	public void setPensionDetailId(int pensionDetailId) {
		this.pensionDetailId = pensionDetailId;
	}
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public double getBankServiceCharge() {
		return bankServiceCharge;
	}
	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

}

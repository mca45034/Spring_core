package com.rays.primary;

public class AllBanKIn {
	private Bank bank;

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public void allMessage(String message) {
		bank.message(message);
	}
}

package com.cdac.acts.Account;

import java.util.Date;

public class SavingAccount  extends Accounts {
	private double interestrate;
	
	public SavingAccount() {
		super();
		interestrate = 0.03;
		
	}
	
	public SavingAccount( String accountName, Date dateOfOpening, double balance) {
		super(accountGenerator, accountName, dateOfOpening, balance);
		interestrate = 0.03;
		
	}
	
	

	@Override
	public double applyInterest() {
	  double interestAmount = getBalance() * interestrate;
	
		return interestAmount;
	}
	

}



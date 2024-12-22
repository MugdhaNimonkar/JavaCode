package com.cdac.acts.Account;

import java.util.Date;

import com.cdac.acts.AccountI.Depositable;
import com.cdac.acts.AccountI.Withdrawable;

public class CurrentAccount extends Accounts implements Depositable, Withdrawable {
private double InterestRate;

	
	public CurrentAccount() {
		super();
		InterestRate = 0.01;
		
	}
	
	public CurrentAccount(String accountName, Date dateOfOpening, double balance) {
		super(accountGenerator, accountName, dateOfOpening, balance);
		InterestRate = 0.01;
		
	}
	
	

	@Override
	public double applyInterest() {
	  double interestAmount = getBalance() * InterestRate;
		
	  
		return interestAmount;
	}

	@Override
	public double withdraw() {
	
		return 0;
	}

	@Override
	public double deposit() {
		// TODO Auto-generated method stub
		return 0;
	}

}

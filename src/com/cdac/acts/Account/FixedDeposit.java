package com.cdac.acts.Account;

import java.util.Date;

public class FixedDeposit extends Accounts{
	private double interestrate;
	private static int time = 2;
		
		public FixedDeposit() {
			super();
			interestrate = 0.08;
			time = 2;
			
		}
		
		public FixedDeposit(String accountName, Date dateOfOpening, double balance) {
			super(time, accountName, dateOfOpening, balance);
			interestrate = 0.08;
			time = 2;
			
		}
		
		

		@Override
		public double applyInterest() {
		  double maturityAmount = getBalance() + (getBalance() * interestrate * (time / 100));
			return maturityAmount;
		}
		
	}



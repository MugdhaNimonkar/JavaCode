package com.cdac.acts.Account;

import java.util.Date;

public abstract  class Accounts {
	public static int accountGenerator= 1000;
	private int accountNo;
	private String accountName;
	private Date dateOfOpening;
	private double balance;
	
	public Accounts() {
		 this.accountNo = 0;
		 this.accountName = " ";
		 this.dateOfOpening = null;
	     this.balance =0.0;
	 }
	 
	 public Accounts(int accountNo, String accountName, Date dateOfOpening, double balance) {
		 this.accountNo = accountNo;
		 this.accountName = accountName;
		 this.dateOfOpening = dateOfOpening;
	     this.balance = balance;
	 }

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Date getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	  public abstract double applyInterest();
	 
	  @Override
	 public String toString() {
		 return "Account No: " +accountNo+ 
				 "Account Name: " +accountName+
				 "Date of Opening : " + DateUtils.getFormatteddate(dateOfOpening) + " ";
		 
		 }
	 }
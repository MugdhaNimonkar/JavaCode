package com.cdac.acts.AccountMain;
import java.util.*;

import com.cdac.acts.AccountI.Withdrawable;
public class AccountsMain {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String accName;
		double amt;
		int choice;
		int count = 0;
		long accNo;
		
		AccountsMain [] acc = new AccountsMain[10];
		
		do {
			
			System.out.println("1. Create Current Account");
			System.out.println("2. Create Deposit Account");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Deposit Amount");
			System.out.println("5. Maturable Amount");
			System.out.println("6. Exit");
			choice = s.nextInt();
			s.nextLine(); 
			
			switch (choice) {
			case 1:
			{
				System.out.println("Please Enter Your Name:");
				accName = s.nextLine();
				System.out.println("Please Enter the Amount:");
				amt = s.nextDouble();
				acc[count++] = (AccountsMain) new AccountsMain();
				System.out.println("Your Account Number is this:"  + acc[count -1].getAccNo());
				break;
			}
			
			case 2:
			{
				System.out.println("Please Enter Your Name:");
				accName = s.nextLine();
				System.out.println("Please Enter the Amount:");
				amt = s.nextDouble();
				acc[count++] = new AccountsMain();
				System.out.println("Your Account Number is this:"  + acc[count -1].getAccNo());
				break;
			}
			
			case 3:
			{
				System.out.println("Please Enter Your Account Number:");
				accNo = s.nextLong();
				
				for(int i= 0 ; i <count ; i ++) {
					if(accNo == acc[i].getAccNo()) {
						if(acc[i] instanceof Withdrawable) {
							System.out.println("Please Enter the amount:");
							amt = s.nextDouble();
							Withdrawable w = (Withdrawable)acc[i];
							double rem = w.withdraw();
							System.out.println("Amount withdrawal successful and our remaining balance is:" + rem);
							}
						System.out.println("This functionality is not available for your account");
						}
				}
				break;}
			
			
			case 4:
			{
				System.out.println("Please Enter Your Account Number:");
				accNo = s.nextLong();
				
				for(int i= 0 ; i <count ; i ++) {
					if(accNo == acc[i].getAccNo()) {
						System.out.println("Please Enter the amount:");
						amt = s.nextDouble();
						Depositable de = (Depositable)acc[i];
						double rem = de.deposit(amt);
						System.out.println("Amount deposited successfully and your remaining balance is:" + rem);
					}
					System.out.println("Account not found");
				}
				break;
			}
			
			case 5:
			{
				System.out.println("Please Enter Your Account Number:");
				accNo = s.nextLong();
				
				for(int i= 0 ; i <count ; i ++) {
					if(accNo == acc[i].getAccNo()) {
						if(acc[i] instanceof Maturable) {
							Maturable me = (Maturable)acc[i];
							System.out.println("Maturable amount after 10 years:" + me.calculateMaturable());
						}
					}	
				}
				break;
			}
			case 6:{
				System.out.println("Exit");
				break;
			}
			
			default:
				System.out.println("Invalid Choice");
			}
			
		}while(choice != 0);
	
	}

private String getAccNo() {
	// TODO Auto-generated method stub
	return null;
}
}

private long getAccNo() {
	// TODO Auto-generated method stub
	return 0;
}


}

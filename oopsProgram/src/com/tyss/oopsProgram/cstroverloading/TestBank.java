package com.tyss.oopsProgram.cstroverloading;

public class TestBank {

	public static void main(String[] args) {
	BankDetails b1 = new BankDetails();
	System.out.println(b1.accountNo);
	System.out.println(b1.balance);
	System.out.println(b1.bankName);
	
	BankDetails b2 = new BankDetails("SBI",1235677899, 789422.6788);
	System.out.println("account number = "+b2.accountNo);
	System.out.println("balance = "+b2.balance);
	System.out.println("name of bank is"+b2.bankName);
	
	BankDetails b3 = new BankDetails(234567897);
	System.out.println("account number = "+b3.accountNo);
	System.out.println("balance = "+b3.balance);
	System.out.println("name of bank is"+b3.bankName);
	
	

	}

}

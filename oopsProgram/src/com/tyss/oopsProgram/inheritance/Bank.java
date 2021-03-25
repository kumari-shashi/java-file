package com.tyss.oopsProgram.inheritance;

public class Bank {
	int balance;
//	String bankName;
//	long accountNo;
//	String ifscCode;
//	public Bank(String bankName, long accountNo, String ifscCode) {
//		 this.bankName  = bankName;
//		 this.accountNo = accountNo;
//		 this.ifscCode = ifscCode;
		 
//		
//	}
	public void withdraw(int amt) {
		balance = balance- amt;
		System.out.println("after withdrawing the balance is = "+balance);
		
	}
	public void deposite(int amt) {
		balance = balance+ amt;
		System.out.println( "after withdrawing the balance is = "+balance);
		
	}

}

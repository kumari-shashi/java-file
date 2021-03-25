package com.tyss.oopsProgram.cstroverloading;

public class BankDetails {
	String bankName;
	long accountNo;
	double balance;
	public BankDetails(String name,long accNo,double blnce ) {
		bankName = name;
		accountNo = accNo;
		balance = blnce;	
	}
	public BankDetails( long accNo) {
		accountNo = accNo;
	}
	public BankDetails() {
		
	}
	

}

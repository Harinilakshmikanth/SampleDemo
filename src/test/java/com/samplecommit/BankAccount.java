package com.samplecommit;

public class BankAccount {
	
	private String name;
	private String ifsccode;
	private long accountno;
	private double accountbalance;
	
	public void setaccountDetails(String name,String ifsccode ,long accountno,double accountbalance ) {
		this.name=name;
		this.ifsccode=ifsccode;
		this.accountno=accountno;
		this.accountbalance=accountbalance;
		
	}
	public String getName() {
		return name;
	}
	public String getIfscCode() {
		return ifsccode;
	}
	public long getAccountNo() {
		return accountno;
	}
	public double getAccountBalance() {
		return accountno;
	}


}

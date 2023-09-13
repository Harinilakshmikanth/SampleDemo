package com.samplecommit;

public class Driver {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setaccountDetails("Harini","DBGTY000",123456,120000.0d);

		System.out.println("Name: " + b.getName() + "\n" +
                "IFSC Code: " + b.getIfscCode() + "\n" +
                "Account Number: " + b.getAccountNo() + "\n" +
                "Account Balance: " + b.getAccountBalance());
	}

}

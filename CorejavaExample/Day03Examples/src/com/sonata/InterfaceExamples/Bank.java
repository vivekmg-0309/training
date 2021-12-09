package com.sonata.InterfaceExamples;

public class Bank 
{
	int AccId;
	String AccName;
	double Balance;
	
	public Bank() {}
	
	public Bank(int accId, String accName, double balance)
	{
		AccId = accId;
		AccName = accName;
		Balance = balance;
	}
	
	void display() {
	System.out.println(this.AccId);
	System.out.println(this.AccName);
	System.out.println(this.Balance);
	}
	

}

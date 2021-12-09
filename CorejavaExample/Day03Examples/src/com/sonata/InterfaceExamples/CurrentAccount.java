package com.sonata.InterfaceExamples;
import com.sonata.JavaBean.Bank;

public class CurrentAccount extends com.sonata.JavaBean.Bank implements BankInterface {
	
	@Override
	public double withDraw(double amount) {
		double d1= super.getAccBalance()-amount;
		return d1;
	}
	
	@Override
	public double deposite(double amount) {
		double d1= super.getAccBalance()+amount;
		return d1;
	}
	

	public static void main(String[] args) {
		
		CurrentAccount c1= new CurrentAccount();
		c1.setAccNo(123);
		c1.setAccName("show this");
		c1.setAccBalance(100);
		System.out.println(c1.deposite(2000));
		System.out.println(c1);

	}

}

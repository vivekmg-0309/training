package com.sonata;

public class CurrentAccount extends BankExample
{
	CurrentAccount(int a, String b, double c)
	{
		super(a,b,c);
	}
	CurrentAccount(){}

	public static void main(String[] args)
	{
		CurrentAccount c1 = new CurrentAccount ();
		c1.accNo=123;
		c1.accName="AAAA";
		c1.accBalance=4567890;
		c1.display();
		CurrentAccount c2 =new CurrentAccount(467,"DDDDD",67890);
		c2.display();

	}

}

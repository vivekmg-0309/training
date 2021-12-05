package com.sonata;

public class Manager extends Employee
{
	Manager(){}
	Manager (int i, String j, double k)
	{
	super(i,j,k);
     }
	public double salCal(double HRA, double DA)
	{
		double total =super.salCal(HRA,DA)+2000;
		return total;
	}

	public static void main(String args[])
	{
		Manager m1 =new Manager (345,"nnnnn",7896);
		System.out.println(m1.salCal(200,300));
		m1.display();
		
		
	}
	
	}



package com.sonata;

public class Toys extends Product 
{
	Toys(){}
	Toys (int i, String j, double k)
	{
	super(i,j,k);
     }
	public double priceCal(double GST)
	{
		double total =super.priceCal(GST);
		return total;
	}

	public static void main(String[] args) 
	{
		Toys p1 =new Toys (345,"nnnnn",7896);
		System.out.println(p1.priceCal(200));
		p1.display();
		}
	}



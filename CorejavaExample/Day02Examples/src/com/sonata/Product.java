package com.sonata;

public class Product 
{
	int pId;
	String pName;
	double pPrice;
	
	Product(){}
	
    Product (int id , String name, double price)
	{
		this.pId= id;
		this.pName= name;
		this.pPrice=price;
	}
	public double priceCal(double GST)
	{
		double total=this.pPrice+GST;
		return total;
		
	}
	public void display()
	{
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(pPrice);
	}
	public static void main (String args[])
	{
		Product p1 = new Product(123,"Mobile",23000);
		System.out.println(p1.priceCal(2000));
	}
	

}




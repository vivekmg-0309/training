package com.sonata;

public class Employee
{
	int empId;
	String empName;
	double empSal;
	
	Employee(){}
	
	Employee (int id , String name, double sal)
	{
		this.empId= id;
		this.empName= name;
		this.empSal=sal;
	}
	public double salCal(double HRA, double DA)
	{
		double total=this.empSal+HRA+DA;
		return total;
		
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}
	

}

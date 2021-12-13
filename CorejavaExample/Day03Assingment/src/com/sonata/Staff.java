package com.sonata;

public class Staff extends Employee
{
	public double calSal() {
		double total = Employee.basicPay + Employee.basicPay * .18;
		return total;
	}

	@Override
	public String toString() {
		return "Staff [calSal()=" + calSal() + "]";
	}


}

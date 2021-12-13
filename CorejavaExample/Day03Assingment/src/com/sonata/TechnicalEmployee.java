package com.sonata;

public class TechnicalEmployee 
{
	public double calSal() {
		double total = Employee.basicPay + Employee.basicPay * .12;
		return total;
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [calSal()=" + calSal() + "]";
	}

}

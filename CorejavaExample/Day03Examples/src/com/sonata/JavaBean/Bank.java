package com.sonata.JavaBean;

public class Bank
{
	private int accNo;
	private String accName;
	private double accBalance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	
}

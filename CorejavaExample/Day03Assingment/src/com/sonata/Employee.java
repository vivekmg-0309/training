package com.sonata;

public abstract class Employee 
{
	public static int empID;
	public static String empName;
	Address obj ; 
	
	public static int noOfLeaves;
	public static double basicPay;
	abstract double calSal();
	public static int getEmpID() {
		return empID;
	}
	public static void setEmpID(int empID) {
		Employee.empID = empID;
	}
	public static String getEmpName() {
		return empName;
	}
	public static void setEmpName(String empName) {
		Employee.empName = empName;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	public static int getNoOfLeaves() {
		return noOfLeaves;
	}
	public static void setNoOfLeaves(int noOfLeaves) {
		Employee.noOfLeaves = noOfLeaves;
	}
	public static double getBasicPay() {
		return basicPay;
	}
	public static void setBasicPay(double basicPay) {
		Employee.basicPay = basicPay;
	}
	@Override
	public String toString() {
		return "Employee Name" + getEmpName() + "/n Employee ID " + getEmpID();
	}

}

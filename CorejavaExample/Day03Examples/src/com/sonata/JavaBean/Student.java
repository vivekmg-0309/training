package com.sonata.JavaBean;

public class Student
{
	private int stdId;
	private String stdName;
	private double stdMarks;
	Address obj;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + ", obj=" + obj + "]";
	}
	
	
	

}

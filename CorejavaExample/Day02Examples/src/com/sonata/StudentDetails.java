package com.sonata;

public class StudentDetails 
{
	int stdId;
	String stdName;
	double stdMarks;
	StudentDetails(int n, String name, double b){
		this.stdId = n;
		this.stdName= name;
		this.stdMarks=b;
		}
	StudentDetails(){}
	
public void display()
{
	System.out.println(stdId);
	System.out.println(stdName);
	System.out.println(stdMarks);
}
public static void main(String args[])
{
	StudentDetails  b1 = new StudentDetails ();
	b1.stdId=22159;
	b1.stdName="M G Vivek";
	b1.stdMarks=62;
	b1.display();
	StudentDetails b2 = new StudentDetails(21256,"abc",54);
	b2.display();
}
}
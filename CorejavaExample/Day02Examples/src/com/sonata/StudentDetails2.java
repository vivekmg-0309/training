package com.sonata;

public class StudentDetails2 extends StudentDetails 
{
	StudentDetails2 (int a, String b, double c)
	{
	
	super (a,b,c);
     }
	StudentDetails2(){}
	
	public static void main(String[] args)
	{
		StudentDetails2 d1 = new StudentDetails2();
		d1.stdId=123;
		d1.stdName="rrrrrr";
		d1.stdMarks=35;
		d1.display();
		StudentDetails2 d2 = new StudentDetails2(456,"fffff",50);
		d2.display();

	}

}

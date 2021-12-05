package com.sonata;

public class Tshirt 
{
	String color;
	String material;
	String design;
	String size;
	Tshirt(String c,String m,String d,String s)
	{
		this.color= c;
		this.material= m;
		this.design=d;
		this.size=s;
	}
Tshirt(){}

public void Display()
{
	System.out.println(color);
	System.out.println( design);
	System.out.println( material);
	System.out.println( size);
}
	public static void main(String[] args) 
	{
		Tshirt t1=new Tshirt("black","wool","sweat tshirt","small");
		Tshirt t2=new Tshirt("blue","cotton","round neck","large");
		Tshirt t3=new Tshirt("red","denim","collar less","extra-large");
		System.out.println("first Tshirt:");
		t1.Display();
		System.out.println("second Tshirt:");
		t2.Display();
		System.out.println("third Tshirt:");
		t3.Display();
	}



}

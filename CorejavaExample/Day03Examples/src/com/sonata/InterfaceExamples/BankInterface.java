package com.sonata.InterfaceExamples;

public interface BankInterface 
{
int abc=30;
public double withDraw(double amount);
public double deposite(double amount);

//can be overrdien
default void newMethod() {
	System.out.println("Newly added default method");
	gen();
}
default void myMethod() {
	System.out.println("Newly aded default method");
	gen();
}
private void gen() {
	System.out.println("Orivate method");
}


//can overriden
static void anotherNewMethod() {
	System.out.println("Newly added static method");
}
	}



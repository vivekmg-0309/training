package com.sonata.LamdaExpression;

@FunctionalInterface
interface simple{
	void sum(int a);
}

public class LambdaExample {

	
	public static void main (String args[]) {
		
		simple s1 =(int a)-> {System.out.println("Welcome to lamba a"+ a);};
		s1.sum(10);
		
		
		MyOneInterface x1 = () -> {System.out.println("my functional interface");};
		x1.display();
		x1.showOne();
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
package com.sonata.LamdaExpression;

public class LogicClass implements MyOneInterface{

	@Override
	public void display() {
	System.out.println("Show this my Display");
		
	}
	public static void main(String[] args) {
		LogicClass l1 = new LogicClass();
		l1.display();
	}
	
	
	

}

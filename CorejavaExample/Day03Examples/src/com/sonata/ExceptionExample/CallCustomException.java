package com.sonata.ExceptionExample;

public class CallCustomException {

	public static void main(String[] args)throws MyOwnException {
		int age = 21;
		if(age<18) {
			throw new MyOwnException("age is less than 18");}
		else {
			System.out.println("Welcome to Vote");
			
		}
		// TODO Auto-generated method stub

	}

}

package com.sonata.ExceptionExample;

public class SimpleException 
{
	public void did() {
		try {
			int c =10/10;
			int a[]= {1,2,3,4};
			System.out.println("it is divid method"+c);
			System.out.println("array index"+a[3]);
		}catch (Exception e) {System.out.println(e);}
		
		finally {
			System.out.println("finally block");
		}
		
	}

		public void show() {
			System.out.println("this is my show method");
		}
		
		public static void main(String args[]) {
			SimpleException s1 = new SimpleException();
			s1.show();
			s1.did();
			s1.show();
			System.out.println("after all methods");
			
		}
		}



package com.sonata;

public class ReverseArray
{
	public static void main(String args[])
	{
		int arr[] = {3,6,9,12,15};
		System.out.println("Main array");
		for (int i=0;i<5;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println("Reversed array");
	      for (int i=5-1; i>= 0; i--)		
	      {
			System.out.println(arr[i] + "");  
		}
	}

}

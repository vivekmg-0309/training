package com.sonata;

public class SpecificValue
{
	public static boolean contains(int[] src,int i)
	{
		for(int n:src) 
		{
			if(i ==n) 
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args)
{
		int[] arr= {1,2,3,4};
		System.out.println(contains(arr,3));
		System.out.println(contains(arr,5));

	}


}

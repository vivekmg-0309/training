package com.sonata;

public class DuplicateVal 
{
	public static void main(String[] args) 
	{
		int arr[]={1,3,3,4,4,5,6,9,9};
		System.out.println("duplicate values are in this array:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}

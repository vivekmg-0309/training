package com.sonata;

public class LargeArray 
{
public static void main(String[] args) {
		
		int array[] =new int[2];
                
		array[0]=5;
		array[1]=10;
 
		int largest1, largest2, temp;
 
		largest1 = array[0];
		largest2 = array[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
 
		System.out.println ("The First largest array is " + largest1);
		System.out.println ("The Second largest array is " + largest2);
 
	}

}

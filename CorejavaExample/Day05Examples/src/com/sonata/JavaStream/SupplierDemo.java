package com.sonata.JavaStream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


public class SupplierDemo implements Supplier<String> 
{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Java Stream API";
	}
	
	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierDemo(); 
		System.out.println(supplier.get());
		
		 List<String> list = Arrays.asList("a","b");
		  System.out.println(list.stream().findAny().orElseGet(supplier));
	}
}

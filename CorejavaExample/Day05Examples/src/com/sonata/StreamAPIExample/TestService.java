package com.sonata.StreamAPIExample;

import java.util.List;
import java.util.stream.Collectors;

public class TestService
{
	public static List<Employee> evaluateTax()
	{
		return DataBaseEmp.getEmployee().stream()
		.filter(emp->emp.getEmpSal()>5000) 
		.collect(Collectors.toList());
	  }
	  
	  public static void main(String args[]) {
		 System.out.println(evaluateTax()); 
	  }
	

}

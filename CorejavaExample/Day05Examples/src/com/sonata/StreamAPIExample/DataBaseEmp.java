package com.sonata.StreamAPIExample;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp 
{
	public static List<Employee>getEmployee() { 
		List<Employee>list = new ArrayList();
		list.add(new Employee(172,"Roshan","IT",5000));
		list.add(new Employee(388,"Santosh","CIVIL",9000));
		list.add(new Employee(245,"Bimal","DEFENCE",4000));
		list.add(new Employee(786,"Prakash","SOCIAL",7000));
		return list;

	}

}

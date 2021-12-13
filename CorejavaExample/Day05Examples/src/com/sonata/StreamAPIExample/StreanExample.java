package com.sonata.StreamAPIExample;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class StreanExample 
{
	 public static void main(String args[]) {
		   List<String> list = new ArrayList<>();
		   list.add("Murrit");
		   list.add("john");
		   list.add("piter");
		   list.add("marek");
		   list.add("mac");
		   
		   for(String s:list) {
			   System.out.println(s);
	    

}
		   list.stream().forEach(t->System.out.println(t));
		   
		   Map<Integer, String>map = new HashMap<>();
		   map.put(1,"a");
		   map.put(2,"b");
		   map.put(3,"c");
		   map.put(4,"d");
		   
		   map.forEach((key, value)->System.out.println(key +":" + value));
		   map.entrySet().stream().forEach(obj->System.out.println(obj));
	 }
	 
}

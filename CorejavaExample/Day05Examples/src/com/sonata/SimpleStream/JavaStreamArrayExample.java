package com.sonata.SimpleStream;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamArrayExample 
{

	public static void main(String[] args) throws IOException {
		String names[]= {"Shailaja","Saoopa","Jayashree","Mary"};
		
		 Arrays.stream(names)
		 .filter(x->x.startsWith("S"))
		 .sorted()
		 .forEach(System.out::println);
		for(String s:names) {System.out.println(s);}
		 
		 //average of an array
		
		 Arrays.stream(new int[] {2,4,5,6,7,8})
		 .map(x->x*x)
		 .average()
		 .ifPresent(System.out::println);
		 
		 //Stream from list , filter and print
		 
		 List<String> people =Arrays.asList("Simple","Show","Just","King");
		 people.stream().map(String::toLowerCase).filter(x->x.startsWith("s")).forEach(System.out::println);
		 
		 //Stream form a file and sort it out
		 Stream<String> lines = Files.lines(Paths.get("D:\\testout.txt"));
		 lines.sorted().filter(x -> x.length()>2)
		 .forEach(System.out::println);
		 lines.close();
		 
		 
		 
	 }

	}


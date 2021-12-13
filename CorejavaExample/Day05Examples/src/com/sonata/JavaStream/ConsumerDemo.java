package com.sonata.JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo implements Consumer<Integer>
{
 
	@Override
	public void accept(Integer t) {
		System.out.println("Printing:+t ");
		
	}
	public static void main(String[] args) {
		ConsumerDemo c1 = new ConsumerDemo();
		c1.accept(10);
		
	 Consumer<Integer> consumer= (t)->{System.out.println(t);};
	  consumer.accept(10);
	  
	  //forEach is the example of consumer
	  
	  List<Integer> list = Arrays.asList(1,2,3,4,5);
	  list.stream().forEach(t->System.out.println(t));
	}
	

}

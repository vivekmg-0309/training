package com.springdemo.etg.impl;

import org.springframework.stereotype.Component;
import com.springdemo.etg.GreetingInterface;


@Component
public class Greeting implements GreetingInterface {

	@Override
	public String sayGreeting(String name) {
		
		return "good morning"+name;
	}

}

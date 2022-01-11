package com.springdemo.etg.impl;

import com.springdemo.etg.ChristmasInterface;
import com.springdemo.etg.GreetingInterface;

public class Christmas implements ChristmasInterface {

	GreetingInterface greeting;

	@Override
	public String happyChristmas(String message) {
		return greeting.sayGreeting(message);
	}

	public void setGreeting(GreetingInterface greeting) {
		this.greeting = greeting;
	}

}

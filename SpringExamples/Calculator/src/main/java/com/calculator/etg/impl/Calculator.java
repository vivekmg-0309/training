package com.calculator.etg.impl;

import org.springframework.stereotype.Component;

import com.calculator.etg.CalculatorInterface;

@Component

public class Calculator implements CalculatorInterface {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

}

package com.calculator.etg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.calculator.etg.impl.Calculator;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CalculatorApplication.class, args);
		Calculator calc = (Calculator) ctx.getBean("calculator");
		System.out.println(calc.add(2, 8));
		System.out.println(calc.sub(10, 2));

	}

}

package com.sonata.LamdaExpression;
@FunctionalInterface
public interface MyOneInterface {
	void display();
	default void showOne() {
		System.out.println("show this");
	}

}

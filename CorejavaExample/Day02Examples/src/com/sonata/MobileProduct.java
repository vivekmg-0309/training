package com.sonata;

public class MobileProduct extends Product1{
	void totalPrice() {
		System.out.println("it is abstsrct method");
	}

	public static void main(String[] args) {
		MobileProduct m1 = new MobileProduct();
		m1.totalPrice();

	}

}

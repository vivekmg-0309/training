package com.sonata;

public class Triangle extends Shape
{
public Triangle(double length, double height, double width) {
		
		super(length,height,width);
	}
	
	public double CalArea() {
		double area = 0.5 * (this.w * this.h);
		return area;
	}
	public static void main(String[] args) {
		Triangle tri = new Triangle(2,3,4);
		System.out.println("Area of Triangle : "+tri.CalArea());
	}

}

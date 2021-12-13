package com.sonata;

public class Rectangle extends Shape
{
public Rectangle( double height, double width) {
		
		super(height,width);
	}
	
	public double CalArea() {
		double area =this.l *this.w;
		return area;
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(3,4);
		System.out.println("Area of Triangle : "+rec.CalArea());
	}


}

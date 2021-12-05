package com.sonata;

public class Car
{
	int speed;
	double regularPrice;
	String color;
public Car() {}
	
	public Car(int a, double b, String c) {
		this.speed=a;
		this.regularPrice=b;
		this.color=c;
		getSalePrice();
	}
	public Car(int a, double b, String c,int d,int e) {
		this.speed=a;
		this.regularPrice=b;
		this.color=c;
		getSalePrice();
	}
	public Car(int a, double b, String c,int d) {
		this.speed=a;
		this.regularPrice=b;
		this.color=c;
		getSalePrice();
	}
	public double getSalePrice() {
		return regularPrice;
	}
	public void display() {
		System.out.println(speed);
		System.out.println(regularPrice);
		System.out.println(color);
		System.out.println(getSalePrice());
	
	}
public static void main(String[]arg) {
	Car c1=new Car(70,20000,"white");
	Sedan s1 = new Sedan(230, 550000,"black", 15);
	Ford f1 = new Ford (210,480000,"blue",2021, 10000);
	Truck t1 = new Truck(130,250000,"red",2500);
	c1.display();
	System.out.println("Salesprice of sedan: "+s1.getSalePrice());
	System.out.println("Saleprice of ford: "+f1.getSalePrice());
	System.out.println("Saleprice of Truck: "+t1.getSalePrice());
	
}

}


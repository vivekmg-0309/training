package com.sonata;

public class Shape 
{
	double l;
	double h;
	double w;
	 
	public Shape(double le, double hei, double wid) {
		this.l = le;
		this.h = hei;
		this.w = wid;
	}
	public Shape(double le) {
		this.l = le;
	}
	public Shape(double le, double wid) {
		this.l = le;
		this.w = wid;
	}
	public double CalArea() {
		return 0;
	}

}

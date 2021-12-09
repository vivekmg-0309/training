package com.sonata.AnnotationExample;


class A{
	public void ShowMyData() {
		System.out.println("Super class a");
	}

	
}
class B extends A{
	@Deprecated
	public void show() {
		System.out.println("my show method");
	}
	@Override 
	@SuppressWarnings("uncheked")
	public void ShowMyData() {
		
		System.out.println("Super class b");
		
	}
}
public class MarkerAnnotationExample {
	public static void main(String[] args) {
		B x = new B();
		x.ShowMyData();
		x.show();
	}
}

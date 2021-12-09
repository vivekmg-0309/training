package com.sonata.AnnotationExample;

@FunctionalInterface
interface Xyz{
	void display();
}
class Emp1 implements Xyz{
	public void myData() {
		System.out.println("myData Methos");
	}

	@Override
	public void display() {
	System.out.println("Show this one");
		
	}
}

class EmpShow extends Emp1{
	@Override()
	public void myData() {
		System.out.println("myData call method");
	}
}

public class AnnotationExample {
	public static void main (String args[]) {
		EmpShow obj = new EmpShow();
		obj.myData();
	}

}

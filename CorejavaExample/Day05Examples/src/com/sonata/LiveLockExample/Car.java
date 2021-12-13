package com.sonata.LiveLockExample;

public class Car 
{
	static final Car2 car2 = new Car2();
	   static final Car1 car1 = new Car1();
	   public static void main(String[] args) {
	        Thread t1 = new Thread(new Runnable() {
	            public void run() {
	                car2.passBridge(car1);
	            }
	        });
	        t1.start();
	 
	        Thread t2 = new Thread(new Runnable() {
	            public void run() {
	                car1.passBridge(car2);
	            }
	        });
	        t2.start();
	    }

}

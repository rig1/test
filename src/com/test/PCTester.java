package com.test;


public class PCTester {
	
	public static void main(String[] args) {
		
		PC pc = new PC();
		Producer p = new Producer(pc);
		Consumer c = new Consumer(pc);
		
		p.start();
		c.start();
		
	}
}

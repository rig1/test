package com.test;


class Producer extends Thread {

	private PC pc;

	public Producer(PC pc) {
		this.pc = pc;
	}

	public void run(){
		
		for(int i=0;i<5;i++){
			System.out.println(" PUT : "+i);
			pc.put(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer extends Thread {

	private PC pc;

	public Consumer(PC pc){
		this.pc = pc;
	}

	public void run(){
		
		for(int i=0; i<5; i++) {
			System.out.println("Consuming : "+pc.get());
		}
	}

}

public class PC {

	boolean flag = false;

	public int i = -1;

	public synchronized void put(int i){
		if(flag == false) {
			this.i = i;
		}
		flag = true;
		notifyAll();

	}

	public synchronized int get(){
		if(flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		flag = false;
		return i;
	}



}

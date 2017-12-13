package com.test;

public class FuncImpl {
	
	
	public int getResult(int a, int b){
		return a + b; 
	}
	
	public void implementation() {
		
		FuncI i1 = (a, b) ->{return a + b; };
		i1.add(12, 12);
		FuncImpl fImpl = new FuncImpl();
		
	}	
	
	
	public static void main(String[] args) {
		
		
	}
	
}

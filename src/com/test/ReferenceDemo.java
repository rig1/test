package com.test;

public class ReferenceDemo {

	public static void commonMethod() {
		System.out.println("This method is already defined.");
	}
	
	public static void commonMethod2() {
		System.out.println(" This is method 2");
	}
	

	public void implement() {

		// Anonymous class.
		IsReferable demoOne = new IsReferable() {
			@Override
			public void referenceDemo() {
				ReferenceDemo.commonMethod();
			}
		};
		demoOne.referenceDemo();

		// Lambda implementaion.
		IsReferable demo = () -> ReferenceDemo.commonMethod();
		demo.referenceDemo();

		// Method reference.
		IsReferable demoTwo = ReferenceDemo::commonMethod;
		demoTwo.referenceDemo();
		
		IsReferable demoThree = ReferenceDemo::commonMethod2;
		demoThree.referenceDemo();
		
		
		
	}
	public static void main(String[] args) {
		new ReferenceDemo().implement();
	}

}

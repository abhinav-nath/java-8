package com.codecafe.java8.functionalinterfaces;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		/* prior to Java 8 - start */

		// create an anonymous class
		// that's the way we normally implement a Functional Interface prior to Java 8
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};

		new Thread(runnable).start();
		/* prior to Java 8 - end */


		/* Java 8 Lambda syntax - start */

		// () -> {}

		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable 2");
		};
		
		// Single line body doesn't need to be written inside the curly braces
		Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");

		new Thread(runnableLambda).start();
		
		new Thread(runnableLambda1).start();
		
		// no need to even assign the lambda expression to a Runnable variable and passing that variable to the Thread instance
		// we can directly pass the lambda expression as a parameter to the Thread instance
		new Thread(() -> System.out.println("Inside Runnable 4")).start();
		
		/* Java 8 Lambda syntax - end */
		
		// same with legacy way
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Legacy Runnable");
			}
		}).start();

	}
}

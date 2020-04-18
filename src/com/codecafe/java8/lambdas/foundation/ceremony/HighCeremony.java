package com.codecafe.java8.lambdas.foundation.ceremony;

public class HighCeremony {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("In another thread");				
			}
		});

		th.start();
		
		System.out.println("In main thread");
	}

}
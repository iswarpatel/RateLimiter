package main;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(false);
		AtomicInteger counter = new AtomicInteger();
		Thread t1 = new Thread(new Fill(counter));
		Thread t2 = new Thread(new Consumer(counter));
		t1.start();
		t2.start();
	}

}

package main;

import java.util.concurrent.atomic.AtomicInteger;

public class Fill implements Runnable{
	AtomicInteger ctr;
	
	public Fill(AtomicInteger counter) {
		ctr = counter;
	}

	@Override
	public void run() {
		while(true) {
			ctr.addAndGet(2);
			System.out.println("fill"+ ctr);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

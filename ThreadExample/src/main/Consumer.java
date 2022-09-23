package main;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumer implements Runnable{
	AtomicInteger ctr;
	
	public Consumer(AtomicInteger counter) {
		ctr = counter;
	}

	@Override
	public void run() {
		while(true) {
			if(ctr.get() > 0) {
				ctr.decrementAndGet();
				System.out.println("consume"+ ctr);			
			}
			else {
				System.out.println("could not consume"+ ctr);
			}
			try {
				Random r = new Random();
				Thread.sleep(r.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

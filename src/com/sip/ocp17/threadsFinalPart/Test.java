package com.sip.ocp17.threadsFinalPart;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void printMessage(Lock lock) {
		try {
			lock.lock();
			for(int i=0;i<1000;i++)
			{
				System.out.println("i = "+i);
			}
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		//Thread.sleep(2000);
		new Thread(() -> printMessage(lock)).start();
		if (lock.tryLock()) {
			try {
				System.out.println("Lock obtained, entering protected code");
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}

	}

}

package com.sip.ocp17.threadsFinalPart;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConcurrentCollections {

	public static void main(String[] args) {
		/*
		//List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
		List<Integer> favNumbers = new ArrayList<>(List.of(4, 3, 42));
		for (var n : favNumbers) {
			System.out.print(n + " ");
			favNumbers.add(9);
		}
		System.out.println();
		System.out.println("Size: " + favNumbers.size());*/
		
		try {
			var blockingQueue = new LinkedBlockingQueue<Integer>();
			blockingQueue.offer(39);
			blockingQueue.offer(3, 4, TimeUnit.SECONDS);
			System.out.println(blockingQueue.poll());
			System.out.println(blockingQueue.poll(10,
			TimeUnit.MILLISECONDS));
			} catch (InterruptedException e) {
			// Handle interruption
			}


	}

}

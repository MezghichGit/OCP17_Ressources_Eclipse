package com.sip.ocp17.day12_29062024.synchronisation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepCount {

	private int sheepCount = 0;
	//private AtomicInteger sheepCount = new AtomicInteger(0);
	
	/*private void incrementAndReport()
	{
		//System.out.print(++sheepCount+" "); // sheepCount = sheepCount+1
		System.out.print(sheepCount.incrementAndGet()+" ");
	}*/
	
	synchronized private void incrementAndReport()
	{
		//synchronized (this) {
			///++sheepCount;// // sheepCount = sheepCount+1
		//}
		///System.out.print(sheepCount+" "); // sheepCount = sheepCount+1
		System.out.println(Thread.currentThread().getName()+" "+ ++sheepCount+" ");
		
	}
	public static void dispLay(List<Integer>list)  {}
	
	public static void main(String[] args) {
		/*
		List<Integer> list = new ArrayList<>();
		list = new LinkedList();
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist = new LinkedList();*/
		
		dispLay(new ArrayList<>());
		dispLay(new LinkedList());
		
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(10);
			
			SheepCount manager = new SheepCount();
			
			for(int i=0; i<10;i++) {
				service.submit(()->manager.incrementAndReport());
			}
		}
		finally{
			if (service != null) {
				// Shutting down the executor service
				service.shutdown();
			}
		}

	}

}

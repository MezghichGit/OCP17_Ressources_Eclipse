package com.sip.ocp17.day12_29062024;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ManyTasksUsingCachedThreadPool {
	static int v = 0;
	public static void main(String[] args) {
		ExecutorService service =null;
	    
		try {
			service = Executors.newCachedThreadPool();
			
			for(int i=0; i<10; i++)
			{
				service.submit(()-> {
			    try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    for(int k=0; k<1000;k++)
			    {v+=k;}
				System.out.println(Thread.currentThread().getName());
				});
			}
		}
		finally {
			if(service!=null)
			{
				service.shutdown();
				
			}
		}

	}

}

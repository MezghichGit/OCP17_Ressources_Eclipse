package com.sip.ocp17.le28062024;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExempleSchedule {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		// on a ici 4 méthodes à apprendre
		Callable<Integer> c = ()-> {System.out.println("call"); return 10;};
		
		Runnable r = ()-> System.out.println(LocalDateTime.now());
		
		service.schedule(c, 2, TimeUnit.SECONDS); //m1
		service.schedule(r, 4, TimeUnit.SECONDS); //m2
		
		service.scheduleAtFixedRate(r, 1, 30, TimeUnit.DAYS); //m3
		service.scheduleWithFixedDelay(r, 1, 30, TimeUnit.DAYS); //m4

	}

}

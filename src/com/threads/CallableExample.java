package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableExample {

	public static void main(String[] args) {
		ThreadPoolExecutor tp = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		List<Future<Integer>> resultList = new ArrayList<>();
        
        Random random = new Random();
         
        for (int i=0; i<4; i++)
        {
            Integer number = random.nextInt(10);
            CallableImpl calculator  = new CallableImpl(number);
            Future<Integer> result = tp.submit(calculator);
            resultList.add(result);
        }
        
        for(Future<Integer> f : resultList){
        	try {
				System.out.println("Future result is - " + " - " + 
        	f.get() + "; And Task done is " + f.isDone());
			} catch (ExecutionException | InterruptedException e) {
				e.printStackTrace();
			}
        }
      //shut down the executor service now
        tp.shutdown();
	}

}

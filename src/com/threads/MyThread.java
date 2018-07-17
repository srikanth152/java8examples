package com.threads;

public class MyThread  {

	public static void main(String[] args) throws InterruptedException {
//		Thread.currentThread().setPriority(7);
		Test mt = new Test(Thread.currentThread());
		mt.start();
		for(int i=0;i<10;i++){
			System.out.println(" parent thread");
			Thread.sleep(2000);
		}
//		System.out.println(mt.getName()+" "+mt.getPriority());
//		System.out.println(Thread.currentThread().getName()+" ");
//		System.out.println(mt.getName()+" "+mt.getPriority());
//		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
//		Thread t = new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				
//			}
//			
//		});
	}
}

class Test extends Thread{
	
	private Thread t;
	
	public Test(Thread t){
		this.t = t;
	}
	
	public void run(){
		try {
			t.join();
			for(int i=0;i<10;i++){
				System.out.println(" child thread");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

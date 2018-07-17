package com.threads;

public class NumberThread extends Thread{
	
	private PrintNumber pn;
	static Thread mainThread = null;
	
	public NumberThread(PrintNumber pn){
		this.pn = pn;
	}
	
	@Override
	public void run() {
		synchronized (Thread.currentThread() ) {
			for(int i=0;i<5;i++){
			pn.print();
			Thread.currentThread().notify();
			/*try {
			//	Thread.sleep(1000);
			//	mainThread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		mainThread = Thread.currentThread();
		PrintNumber pn = new PrintNumber();
		NumberThread t1 = new NumberThread(pn);
		t1.setName("A");
		t1.start();
		synchronized (t1) {
			for(int i=0;i<5;i++){
			t1.wait();
			pn.print();
		//	Thread.sleep(1000);
		//	mainThread.notify();
			}
		}
		
		/*NumberThread t2 = new NumberThread(pn);
		t2.setName("B");
		t2.start();*/
	}

}

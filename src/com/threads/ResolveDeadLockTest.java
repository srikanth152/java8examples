package com.threads;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ResolveDeadLockTest {

	public static void main(String[] args) {
		ResolveDeadLockTest test = new ResolveDeadLockTest();
		
		final A a = test.new A();
        final B b = test.new B();
        
        Runnable r = new Runnable(){
			@Override
			public void run() {
				synchronized (b) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//Thread-1 already has lock on A now requesting lock on B
					synchronized (a) {
						System.out.println("In block 1");
					}
				}
			}
        };
        
        Runnable r1 = new Runnable(){
			@Override
			public void run() {
				synchronized (b) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (a) {
						System.out.println("In block 2");
					}
				}
			}
        };
        
        new Thread(r).start();
        new Thread(r1).start();
        
	}

	private class A{
		private int i = 10;
		 
        public int getI() {
            return i;
        }
        
        public void setI(int i) {
            this.i = i;
        }
	}
	
	private class B{
		private int i = 20;
		 
        public int getI() {
            return i;
        }
 
        public void setI(int i) {
            this.i = i;
        }
	}
}

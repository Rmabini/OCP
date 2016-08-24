package org.ocp.chapter.concurrency;


public class RunningB {
   
	public static void main(String[] args) throws InterruptedException {
       
		Runnable r = () -> {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("Go out and play");
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			if(i==8){
				System.out.println("Stop playing");
				t.interrupt();
			}else{
				System.out.println("Out and play "+ i + Thread.currentThread().getName());	
			}
			
		}
		t.join();
		
	} 
	
}

package org.ocp.chapter.concurrency;

public class MainHelloWorld {
    
	
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
        System.out.println(Thread.currentThread().getName());
        Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		Thread s = new Thread(r);
		s.start();
		Thread s2 = new Thread(() -> System.out.println(Thread.currentThread().getName()) );
		s2.start();
	}
	
}

class MyThread extends Thread{
	
	public MyThread() {
          super("Hello World");
	}
	
	
	
	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName());
	}
	
}
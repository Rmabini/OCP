package org.ocp.chapter.concurrency;

public class A {

	private Object key1 = new Object();
	private Object key2 = new Object();

	public void a() {
		synchronized (key1) {
			System.out.println("I am in Method a " + Thread.currentThread().getName());
			b();
		}

	}

	public void b() {
		synchronized (key2) {
			System.out.println("I am in Method b " + Thread.currentThread().getName());
			c();
		}
	}

	public void c() {
		synchronized (key1) {
			System.out.println("I am in Method c " + Thread.currentThread().getName());
			
		}
	}
}

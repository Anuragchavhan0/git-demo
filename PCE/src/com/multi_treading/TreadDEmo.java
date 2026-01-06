package com.multi_treading;

public class TreadDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread();
		t.setName("PCE");
		t.setPriority(7);
		System.out.println(t);
		duty();

	}
	static void duty() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}

}

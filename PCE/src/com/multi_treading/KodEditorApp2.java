package com.multi_treading;

class Typing extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Typing.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class SpellCheck extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("SpellCheck.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class Saving extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("saving.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class KodEditorApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Typing();
		Thread t2 = new SpellCheck();
		Thread t3 = new Saving();
		t1.start();
		t2.start();
		t3.start();

	}

}

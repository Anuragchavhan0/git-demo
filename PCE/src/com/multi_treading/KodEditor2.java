package com.multi_treading;

interface runable{
	
}

/* class Typing4  implements runable{
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
class SpellCheck4 implements runable{
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
class Saving4 implements runable{
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
*/

class KodEdit extends Thread{
	public void run() {
		String tName = Thread.currentThread().getName();
		if(tName.equals("type")) {
			typing1();
		}
		else if(tName.equals("spell")){
			spellCheck1();
			
		}
		else {
			saving1();
		}
				
		
			
	}
	
	
	void typing1() {
		for(int i=0;i<10;i++) {
			System.out.println("Typing.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			}
	   }
		
		void spellCheck1() {
			for(int i=0;i<10;i++) {
				System.out.println("spellcheck.....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					}
				}
		   }
			void saving1() {
				for(int i=0;i<10;i++) {
					System.out.println("saving.....");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
				}
			   }
				
}

public class KodEditor2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.out.println("application started ");
		KodEdit k1 = new KodEdit();
		KodEdit k2 = new KodEdit();
		KodEdit k3 = new KodEdit();
		k1.setName("type");
		k2.setName("spell");
		k3.setName("save");
		k3.setDaemon(true);
		k2.setDaemon(true);
		k2.setPriority(3);
		k3.setPriority(4);
		k1.start();
		k2.start();
		k3.start();
		
	
		
		
//		Thread t1 = new Typing();
//		Thread t2 = new SpellCheck();
//		Thread t3 = new Saving();
//		t1.start();
//		t2.start();
//		t3.start();
//		t1.join();
//		t2.join();
//		t3.join();
		System.out.println("application terminated  ");

	}

}

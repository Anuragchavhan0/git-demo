package com.inheritance;

class parent10{
	int x=10;
	void  disp() {
		System.out.println(x);
	}
}
class child10 extends parent10{
	 int x=20;
	void disp() {
	System.out.println(x);
	}
}
public class Student10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child10 c = new child10();
		c.disp();

	}

}

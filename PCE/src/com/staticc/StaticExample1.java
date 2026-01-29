package com.staticc;

class  StaticDemo {
	static int a;
	static int b;
	
	static{
		a=100;
		b=200;
	}
	static void disp() {
		System.out.println(a);
		System.out.println(b);

	}
	
	int x;
	int y;
	{
	a=300;
	b=400;
	x=500;
	y=600;
	}
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}

public class StaticExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.disp();
		StaticDemo sd = new StaticDemo();
		sd.disp2();

	}

}

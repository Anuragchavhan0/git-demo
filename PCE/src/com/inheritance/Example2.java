package com.inheritance;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child8 c = new Child8(100,99);
		System.out.println(c.a +  " "+ c.b);
		

	}

}

class Parent8{
	int a;
	int b;
public Parent8() {
	this(99,99);
	a=10;
	b=20;
	System.out.println("Zero parametrize parent");
}
public Parent8(int a , int b) {
	this.a=a;
	this.b=b;
	System.out.println("2 parametrize parent");
}
}
class Child8 extends Parent8{	
public Child8() {
	a=30;
	b=40;
	System.out.println("Zero parametrize child");
}
public Child8(int a , int b) {
	this();//call the current class constructor
	this.a=a;
	this.b=b;
	System.out.println("2 parametrize child");
}
}
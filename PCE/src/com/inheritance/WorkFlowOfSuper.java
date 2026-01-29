package com.inheritance;

public class WorkFlowOfSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child7 c = new Child7();
		System.out.println(c.a +  " "+ c.b);
		

	}

}

class Parent7{
	int a;
	int b;
public Parent7() {
	a=10;
	b=20;
}
public Parent7(int a , int b) {
	this.a=a;
	this.b=b;
}
}
class Child7 extends Parent7{
	int a;
	int b;
public Child7() {
	a=30;
	b=40;
}
public Child7(int a , int b) {
	this.a=a;
	this.b=b;
}
}